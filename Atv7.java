import java.util.Scanner;

public class Atv7 {
        public static void main(String[] args) {
        
        int nota1, nota2, media, presensa;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas:");
        nota1 = scanner.nextInt();
        nota2 = scanner.nextInt();

        System.out.println("Digite sua presença:");
        presensa = scanner.nextInt();

        media = (nota1 + nota2) / 2;

        if (presensa >= 10) {
            if (media == 10) {
                System.out.println("Aluno aprovado com excelência!");
            } else if (media >= 7 && media <= 10) {
                System.out.println("Aluno aprovado.");
            } else if (media >= 5 && media <= 10) {
                System.out.println("Aluno em recuperação.");
            } else if (media < 5) {
                System.out.println("Aluno reprovado.");
            } else if (media > 10) {
                System.out.println("Nota Inválida.");
            }            
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }

}
