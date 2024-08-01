public class Marcenaria{

    private String endereco ;
    private String nome;
    private String telefone;
    private String cnpj;


    public Marcenaria(String endereco, String nome, String telefone, String cnpj){
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj= cnpj;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setendereco(String endereco){
        this.endereco = endereco;
    }

      public String getnome(){
        return nome;
    }

    public void setnome( String nome){
        this.nome = nome;
    }
      public String gettelefone(){
        return telefone;
    }

    public void settelefone( String telefone){
        this.telefone = telefone;
    }

      public String getcnpj(){
        return cnpj;
    }

    public void setcnpj( String cnpj){
        this.cnpj = cnpj;
    }
}