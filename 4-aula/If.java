import java.util.Scanner;

public class If {
    public static void  main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero?");
        float numero = teclado.nextFloat();
        if(numero > 0){
            System.out.printf("É maior que  0 e o numero foi %.1f",numero);
        }else if(numero == 0) {
            System.out.printf("É igual a 0 e o numero foi %.1f",numero);
        }else {
            System.out.printf("È menor que 0 e o numero foi %.1f",numero);
        }
    }


}