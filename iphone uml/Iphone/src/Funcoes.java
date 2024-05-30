//package iphone;

import iphone.chamadaTelefonica.ChamadaTelefonica;
import iphone.navegarInternet.NavegarInternet;
import iphone.reproduzirMusica.ReproduziMusica;

public class Funcoes implements ChamadaTelefonica, NavegarInternet, ReproduziMusica {
    //Reprodutor Musica
    public void tocar(){
        System.out.println("Tocando Musica");
    }
    public void selecionarMusica(){
        System.out.println("selecionando Musica");
    }

    //Internet
    public void paginaInternet(){
        System.out.println("Exibindo Pagina");
    }
    public void novaAba(){
        System.out.println("Abrindo nova Pagina");
    }
    public  void fecharAba(){
        System.out.println("Fechando aba.");

    }
    public  void atualizarAba(){
        System.out.println("Atualizando aba.");

    }

    //Ações do aparelho telefônico
    public void ligar(){
        System.out.println("Ligando iPhone.");

    }
    public void  atender(){
        System.out.println("Atendendo ligação.");

    }
    public void correioVoz(){
        System.out.println("Iniciando correio de voz");

    }
}
