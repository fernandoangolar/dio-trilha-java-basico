import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Por favor, digite o numero: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o seu Saldo : ");
        double saldo = scanner.nextDouble();

        System.out.print("Por favor, digite o número da Agênda: ");
        String agenda = scanner.next();

        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenda + ", conta " + numero + "  e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
