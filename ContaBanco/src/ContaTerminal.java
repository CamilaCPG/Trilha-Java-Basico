import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá!! Por gentileza, insira as seguintes informações:");

        System.out.println("1. Número da conta:");
        int contaNumero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("2. Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("3. Seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("4. Saldo em conta:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + contaNumero + " e seu saldo " + saldo + " já está disponível para saque!!");
    }
}
