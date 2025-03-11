import java.util.Scanner;

public class Atv10 {
    
    public static void main(String[] args) {
        
        String senha, senhauser;
        Scanner scanner = new Scanner(System.in);

        senha = "programacao";

        System.out.println("Digite sua senha: ");
        senhauser = scanner.next();

        if (senhauser.toLowerCase().contains(senha)) {
            System.out.println("Senha Validada.");
        } else {
            System.out.println("Senha Invalida.");
        }

        scanner.close();
    }

}
