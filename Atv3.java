import java.util.Scanner;
import java.lang.Math;

public class Atv3 {

    public static void main(String[] args) {
        
        double num1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        num1 = scanner.nextDouble();

        System.out.println(Math.sqrt(num1));

        scanner.close();
    }

}