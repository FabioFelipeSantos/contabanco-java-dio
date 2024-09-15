import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o valor a ser depositado: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("\nOlá "
                + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + conta + " e o saldo depositado de R$ " + saldo
                + " já está disponível para saque.");

    }
}
