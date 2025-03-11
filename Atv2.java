import java.util.Scanner;

public class Atv2 {

    public static void main(String[] args) {
        
        int num1, num2, sub, multi, div;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 números:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        div = num1 / num2;
        sub = num1 - num2;
        multi = num1 * num2;
        
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + sub);
        System.out.println("Multiplicação: " + num1 + " x " + num2 + " = " + multi);
        System.out.println("Divisão: " + num1 + " / " + num2 + " = " + div);

        scanner.close();
    }
     
}