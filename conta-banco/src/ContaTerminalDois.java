
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalDois {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu primeiro nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu primeiro sobrenome!");
        String sobreNome = scanner.next();

        System.out.println("Por favor, digite o número da Conta Corrente!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        double saldo = 237.48;

            System.out.println("Olá " + nome + " " + sobreNome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + " e seu saldo " + saldo + " já está dosponível para saque.");

        


    }
}
