import java.util.Scanner;

public class Atv11 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Seu número é par.");
        } else {
            System.out.println("Seu número é ímpar.");
        }
        
        scanner.close();
    }

}
