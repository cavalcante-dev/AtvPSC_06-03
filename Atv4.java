import java.util.Scanner;

public class Atv4 {

    public static void main(String[] args) {
        
        int nota1, nota2, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        nota2 = scanner.nextInt();

        media = (nota1 + nota2) / 2;

        if (media>=7) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        } 

        scanner.close();

    }

}