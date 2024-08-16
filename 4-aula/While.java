import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero?");
        int numero = teclado.nextInt();
        while (numero <= 10) {
           numero ++;
            System.out.println("o numero é " + numero);
        }
    }
}
