import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
        
            System.out.println("Digite a senha: ");
            String senha = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Seu nome é: " + nome);
            System.out.println("Sua senha é: " + senha);
            System.out.println("Sua idade é: " + idade);
            System.out.println("Sua altura é: " + altura);
            scanner.close();    
        } 
        catch (InputMismatchException e) {
            System.err.println("Sua idade ou altura não é um número válido.");
        }

    }
}
