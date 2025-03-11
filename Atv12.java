import java.util.Scanner;

public class Atv12 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        if (num1 % 5 == 0) {
            System.out.println("Seu número é divísivel por 5.");
        } else {
            System.out.println("Seu número não é divísivel por 5.");
        }
        
        scanner.close();
    }

}