import java.util.Scanner;

public class Atv13 {    

    public static void main(String[] args) {
        
        int lado1, lado2, lado3; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os lados do triângulo:");
        lado1 = scanner.nextInt();
        lado2 = scanner.nextInt();
        lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Seu triângulo é equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Seu triângulo é isóceles.");
        } else {
            System.out.println("Seu triângulo é escaleno.");
        }

        scanner.close();
    }
    
}
