import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuario
        
        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu Número de usuario (exemplo: 1021): ");
        int numero = scanner.nextInt();

        System.out.print("Digite a Agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo +
        " já está disponivel para saque");


    }
}
