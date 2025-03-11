import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {

        int numUm, numDois, soma;
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Qual o primeiro número?");
        numUm = scanner.nextInt();

        System.out.println("Qual o segundo número?");
        numDois = scanner.nextInt();

        soma = numUm + numDois;

        System.out.println("O seu resultado é " + soma);

        scanner.close();
    }

}



 