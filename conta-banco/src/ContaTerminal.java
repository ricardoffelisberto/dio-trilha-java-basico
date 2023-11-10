import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência!");
        Integer numero = Integer.parseInt(scan.nextLine());

        System.out.println("Por favor, digite a agência!");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        Double saldo = Double.parseDouble(scan.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
