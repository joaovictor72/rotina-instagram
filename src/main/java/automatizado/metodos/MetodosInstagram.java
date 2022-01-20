package automatizado.metodos;

import automatizado.mapeamento.MapeamentoInstagram;
import org.openqa.selenium.By;

public class MetodosInstagram extends MapeamentoInstagram {

    public void clicarEmRecusarNotificacoes() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getRecusaNotificacao())).click();
        esperarDezSegundos();
    }

    public void clicarEmRecusarSegundaNotificacao() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getRecusaSegundaNotificacao())).click();
        esperarDezSegundos();
    }

    public void clicarBotaoCurtirPostagem() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoCurtir())).click();
        esperarDezSegundos();
    }


    public void clicarBotaoComentar() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoComentar())).click();
        esperarDezSegundos();
    }

    public void clicarBotaoComentarZoom() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoComentarZoom())).click();
        esperarDezSegundos();
    }

   public void escreverComentario() {
       esperarDezSegundos();
       driver.findElement(By.xpath(getInPutComentario())).sendKeys("rere");
       esperarDezSegundos();
   }

   public void clicarBotaoPublicarZoom() {
       esperarDezSegundos();
       driver.findElement(By.xpath(getBotaoPublicarZoom())).click();
       esperarDezSegundos();
   }

    public void clicarPrimeiroStory(){
        esperarDezSegundos();
        driver.findElement(By.xpath(getClicaPrimeiroStory())).click();
        esperarDezSegundos();
    }

    public void comentarPrimeiroStories() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getInPutPrimeiroStory())).sendKeys("LOLLLL");
        esperarDezSegundos();
    }

    public void clicarBotaoEnviarStory () {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoEnviarStory())).click();
        esperarDezSegundos();
    }

    public void clicarPesquisarPerfil () {
        esperarDezSegundos();
        driver.findElement(By.xpath(getInPutPesquisar())).click();
        esperarDezSegundos();
    }

    public void escreverNomeNaPesquisa() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getPrimeiroListadoPesquisa())).sendKeys("erling");
        esperarDezSegundos();
    }

    public void clicarNoPrimeiroListado() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getClicaPrimeiroListado())).click();
        esperarDezSegundos();
    }


    public void clicarPrimeiraFotoPerfil() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getAbrePrimeiraFoto())).click();
        esperarDezSegundos();
    }

    public void curtirPrimeiraFotoAberta() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getCurtePrimeiraFotoAberta())).click();
        esperarDezSegundos();
    }

    public void clicarTresPontinhos () {
        esperarDezSegundos();
        driver.findElement(By.xpath(getTresPontinhos())).click();
        esperarDezSegundos();
    }

    public void clicarBotaoDenunciar () {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoDenunciar())).click();
        esperarDezSegundos();
    }

    public void clicarBotaoDenunciarSpam() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoSpam())).click();
        esperarDezSegundos();
    }

    public void clicarBotaoFecharDenuncia() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoFechar())).click();
        esperarDezSegundos();
    }

    public void curtirPostagem() {
        esperarDezSegundos();
        clicarBotaoCurtirPostagem();
        esperarDezSegundos();
    }

    public void recusarNotificacoes() {
        clicarEmRecusarNotificacoes();
        clicarEmRecusarSegundaNotificacao();
    }

    public void comentarPostagemFeed() {
        clicarBotaoComentar();
        clicarBotaoComentarZoom();
        escreverComentario();
        clicarBotaoPublicarZoom();
    }


    public void reagirPrimeiroStories() {
        clicarPrimeiroStory();
        comentarPrimeiroStories();
        clicarBotaoEnviarStory();
    }

    public void pesquisarPerfil() {
        clicarPesquisarPerfil();
        escreverNomeNaPesquisa();
        clicarNoPrimeiroListado();
    }


    public void curtirPrimeiraFotoNoPerfil() {
        clicarPrimeiraFotoPerfil();
        curtirPrimeiraFotoAberta();
    }
    public void denunciaPrimeiroPostFeed() {
        clicarTresPontinhos();
        clicarBotaoDenunciar();
        clicarBotaoDenunciarSpam();
        clicarBotaoFecharDenuncia();
    }
}
