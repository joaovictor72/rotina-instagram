package automatizado.rotinas;

import automatizado.base.Base;
import automatizado.base.BaseInstagram;
import automatizado.metodos.MetodosInstagram;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;


public class RotinaInstagram extends MetodosInstagram {
    @Test
    public void curtirComentario() throws InterruptedException, IOException {
        esperarDezSegundos();
        recusarNotificacoes();
        curtirPostagem();
    }

    @Test
    public void fazerComentario() throws InterruptedException {
        esperarDezSegundos();
        recusarNotificacoes();
        comentarPostagemFeed();
    }

    @Test
    public void responderStories() throws InterruptedException {
        esperarDezSegundos();
        recusarNotificacoes();
        reagirPrimeiroStories();
    }

    @Test
    public void curtirNoPerfil() throws InterruptedException {
        esperarDezSegundos();
        recusarNotificacoes();
        pesquisarPerfil();
        curtirPrimeiraFotoNoPerfil();
    }

    @Test
    public void denunciarPrimeiroPost() throws InterruptedException {
        esperarDezSegundos();
        recusarNotificacoes();
        denunciaPrimeiroPostFeed();
    }

}