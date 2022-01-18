package automatizado.metodos;

import automatizado.mapeamento.MapeamentoInstagram;
import org.openqa.selenium.By;

public class MetodosInstagram extends MapeamentoInstagram {
    public void recusarNotificacoes() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getRecusaNotificacao())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getRecusaSegundaNotificacao())).click();
        esperarDezSegundos();
    }


    public void curtirPostagem() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoCurtir())).click();
        esperarDezSegundos();
    }

    public void comentarPostagemFeed() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoComentar())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoComentarZoom())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getInPutComentario())).sendKeys("rere");
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoPublicarZoom())).click();
        esperarDezSegundos();
    }

    public void reagirPrimeiroStories() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getClicaPrimeiroStory())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getInPutPrimeiroStory())).sendKeys("LOLLLL");
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoEnviarStory())).click();
        esperarDezSegundos();
    }

    public void pesquisarPerfil() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getInPutPesquisar())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getPrimeiroListadoPesquisa())).sendKeys("erling");
        esperarDezSegundos();
        driver.findElement(By.xpath(getClicaPrimeiroListado())).click();
        esperarDezSegundos();
    }

    public void curtirPrimeiraFotoNoPerfil() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getAbrePrimeiraFoto())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getCurtePrimeiraFotoAberta())).click();
        esperarDezSegundos();
    }

    public void denunciaPrimeiroPostFeed() {
        esperarDezSegundos();
        driver.findElement(By.xpath(getTresPontinhos())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoDenunciar())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoSpam())).click();
        esperarDezSegundos();
        driver.findElement(By.xpath(getBotaoFechar())).click();
    }
}
