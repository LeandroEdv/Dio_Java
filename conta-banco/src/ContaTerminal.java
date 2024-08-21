import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Numero da Conta: ");
        int numero = teclado.nextInt();

        System.out.println("Numero da Agência: ");
        String agencia = teclado.next();

        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = teclado.next();

        System.out.println("Saldo inicial: ");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente +" , obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


    }

}