import java.util.Scanner;

public class Atv5 {
    
    public static void main(String[] args) {
        
        int temperatura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura, em graus?");
        temperatura = scanner.nextInt();

        if (temperatura>=25) {
            System.out.println("A temperatura " + temperatura + "°C no momento está quente.");
        } else {
            System.out.println("A temperatura " + temperatura + "°C no momento está fria.");
        }

        scanner.close();
        
    }

}
