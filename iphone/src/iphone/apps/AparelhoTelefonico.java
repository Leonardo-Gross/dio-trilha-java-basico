package iphone.apps;
import java.util.Random;
import java.util.Scanner;

public class AparelhoTelefonico {

    public void abrirAparelhoTelefonico(){
        System.out.println("Aplicativo Aparelho Telefonico aberto!");
    }

    public void ligar(){
        Random random = new Random();
        int atender = random.nextInt(0, 2);
        System.out.println("Ligando...");
        if (atender == 1){
            System.out.println("Chamada atendida!");
        }else{
            System.out.println("Chamada não atendida!");
        }
    }

    public void atender(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está recebendo uma ligação! Deseja atende-la? (S/N)");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")){
            System.out.println( "Chamada atendida!");
        }else if (resposta.equals("N")){
            System.out.println("Chamada recusada!");
        }
        else {
            System.out.println("Resposta inválida! Tente novamente.");
        }
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz...");
    }
}
