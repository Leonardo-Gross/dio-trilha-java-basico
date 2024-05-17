package iphone;

import iphone.apps.AparelhoTelefonico;
import iphone.apps.NavegadorInternet;
import iphone.apps.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {

        ReprodutorMusical rm = new ReprodutorMusical();
        rm.abrirReprodutorMusical();
        rm.selcionarMusica();
        rm.tocarMusica();
        rm.pausarMusica();

        AparelhoTelefonico at = new AparelhoTelefonico();
        at.abrirAparelhoTelefonico();
        at.ligar();
        at.atender();
        at.iniciarCorreioVoz();

        NavegadorInternet ni = new NavegadorInternet();
        ni.abrirNavegadorInternet();
        ni.exibirPagina();
        ni.adicionarNovaAba();
        ni.atualizarPagina();
    }
}