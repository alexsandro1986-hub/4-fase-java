package com.example.relacionamento.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.relacionamento.dtos.request.UsuarioDTO;
import com.example.relacionamento.entity.Author;
import com.example.relacionamento.entity.Book;
import com.example.relacionamento.repository.AuthorRepository;
import com.example.relacionamento.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/authors")
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PostMapping("/books")
    // public Book createBook(@RequestBody Book book) {
    // return bookRepository.save(book);
    public ResponseEntity<?> postMethodName
    (@RequestBody UsuarioDTO dto) {

    return ResponseEntity.status(201).body("OIIIIII");

    }
    // @PostMapping("/books")
    // public ResponseEntity<?> createBook(@RequestBody UsuarioDTO dto) {
    //     try {
    //         // Verifique se o autor existe
    //         Author author = authorRepository.findById(dto.getId())
    //             .orElseThrow(() -> new RuntimeException("Autor não encontrado"));
    
    //         // Cria um novo livro e associa ao autor
    //         Book newBook = new Book();
    //         newBook.setTitle(dto.getTitle()); // Título do livro
    //         newBook.setAuthor(author);  // Associa o autor
    
    //         // Salva o livro no repositório
    //         Book savedBook = bookRepository.save(newBook);
    
    //         // Retorna o livro criado com status 201
    //         return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
    //     } catch (Exception e) {
    //         e.printStackTrace(); // Loga a exceção no console
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    //             .body("Erro ao criar o livro: " + e.getMessage());
    //     }
    // }
    

    @GetMapping("/authors/{id}")
    public ResponseEntity<UsuarioDTO> getAuthor(@PathVariable Long id) {
        try {
            // Busca o autor pelo ID
            Author author = authorRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Autor não encontrado"));

            // Converte o Author para UsuarioDTO
            UsuarioDTO dto = new UsuarioDTO(id, null, null);
            dto.setId(author.getId());
            dto.setNome(author.getName()); // Define o nome do DTO com o nome da entidade Author

            // Retorna o DTO como resposta
            return ResponseEntity.ok(dto);
        } catch (Exception e) {
            // Caso ocorra algum erro, retorna um erro genérico com status 500 (Internal
            // Server Error)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // @GetMapping("/authors/{id}")
    // public Author getAuthor(@PathVariable Long id) {
    // return authorRepository.findById(id).orElse(null);
    // }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookRepository.findById(id).orElse(null);

    }

    @GetMapping("/authors/{id}/books")
    public Set<Book> getBooksByAuthor(@PathVariable Long id) {
        Author author = authorRepository.findById(id).orElse(null);
        return author != null ? author.getBooks() : null;
    }

    // spring.application.name=relacionamento
    // spring.datasource.url=jdbc:postgresql://localhost:5432/Livraria
    // spring.datasource.username=postgres
    // spring.datasource.password=senai
    // spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

    // spring.datasource.driver-class-name=org.postgresql.Driver

}
