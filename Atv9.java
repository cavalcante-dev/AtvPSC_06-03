import java.util.Scanner;

public class Atv9 {
    
    public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt(); 

        if (num1 > 100) {
            System.out.println("Seu número é maior do que 100.");
        } else {
            System.out.println("Seu número não é maior que 100.");
        }

        scanner.close();
    }
    
}
