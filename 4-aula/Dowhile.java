import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero?");
        int numero = teclado.nextInt();
        do {
            System.out.println("O numero é " + numero );
            numero ++;
        } while (numero<= 10);
    }
}