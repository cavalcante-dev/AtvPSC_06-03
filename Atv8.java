import java.util.Scanner;

public class Atv8 {
    
    public static void main(String[] args) {
        
        int num1, num2, num3, media, maiornum, menornum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        media = (num1 + num2 + num3) / 3;

        menornum = Math.min(num1,Math.min(num2,num3));
        maiornum = Math.max(num1,Math.max(num2,num3));
        
        System.out.println("O média dos números é " + media);
        System.out.println("O menor número é " + menornum);
        System.out.println("O maior número é " + maiornum);

        scanner.close();
        
    }

}
