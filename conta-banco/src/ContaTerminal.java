import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //ToDo: Conhecer e importar a classe Scanner ✅
        //Exibir as mensagens para o nosso usuário ✅
        //Obter pela scanner os valores digitados no terminal ✅
        //Exibir a mensagem conta rápida ✅

        Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);
            
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numero_conta = scanner.nextInt();
    
        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o valor do saldo: ");
        Double saldo = scanner.nextDouble();
    
    
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
