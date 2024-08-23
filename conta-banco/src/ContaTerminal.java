import java.util.Scanner;

/**
 * The {@code ContaTerminal} class provides a simple command-line interface 
 * for collecting account information and displaying a formatted message with 
 * the account details.
 * <p>
 * This program prompts the user to enter the following details:
 * <ul>
 * <li>Account number</li>
 * <li>Agency number</li>
 * <li>Client name</li>
 * <li>Account balance</li>
 * </ul>
 * It then displays a personalized message with the provided information.
 * </p>
 */

public class ContaTerminal {

    /**
     * The entry point of the application. This method collects user input for 
     * account details, calculates the final message, and prints it to the console.
     * 
     * @param args command-line arguments (not used in this application)
     * @throws Exception if any input operation fails
     */

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitando o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        // Solicitando o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        // Solicitando o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        // Solicitando o saldo da conta
        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();

        // Construindo a mensagem final
        String mensagem = "Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, ")
                .concat("sua agência é ").concat(agencia)
                .concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo ").concat(String.format("%.2f", saldo))
                .concat(" já está disponível para saque.");

        // Exibindo a mensagem
        System.out.println(mensagem);

        scanner.close();
    }
}
