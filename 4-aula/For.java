import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero?");
        int numero = teclado.nextInt();

        for (int i = 2; i <= numero; i++) {
            System.out.println(i);
        }

    }
}
