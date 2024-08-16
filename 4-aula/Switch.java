import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero?");
        int semana = teclado.nextInt();
        switch (semana) {
            case 1:
                System.out.println("Segunda");
                break;

            case 2:
                System.out.println("Terça");
                break;

            case 3:
                System.out.println("Quarta");
                break;

            case 4:
                System.out.println("Quinta");
                break;

            case 5:
                System.out.println("Sexta");
                break;

            case 6:
                System.out.println("Sabado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.err.println("Dia invalido");
                break;
        }
    }
}
