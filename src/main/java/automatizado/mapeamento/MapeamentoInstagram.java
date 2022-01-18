package automatizado.mapeamento;

import automatizado.base.BaseInstagram;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MapeamentoInstagram extends BaseInstagram {
    private String botaoCurtir = "//span/button";
    private String botaoComentar = "//span[2]/button";
    private String botaoComentarZoom = "//div[2]/section/span[2]/button";
    private String inPutComentario = "//div[2]/section[3]/div/form/textarea";
    private String botaoPublicarZoom = "//div[2]/section[3]/div/form/button[2]";
    private String recusaNotificacao = "//button[contains(.,\'Agora não\')]";
    private String clicaPrimeiroStory = "//button";
    private String inPutPrimeiroStory = "//textarea";
    private String botaoEnviarStory = "//button[contains(.,\'Enviar\')]";
    private String inPutPesquisar = "//span[contains(.,\'Pesquisar\')]";
    private String primeiroListadoPesquisa = "//div[2]/input";
    private String clicaPrimeiroListado = "//a/div/div[2]/div/div/div/div";
    private String abrePrimeiraFoto = "//div/div/div/a";
    private String curtePrimeiraFotoAberta = "//section/span/button";
    private String recusaSegundaNotificacao = "//div[3]/button[2]";
    private String tresPontinhos = "//article/div/div/div/div/button";
    private String botaoDenunciar = "//button[contains(.,\'Denunciar\')]";
    private String botaoSpam = "//button[contains(.,\'É spam\')]";
    private String botaoFechar = "//button[contains(.,\'Fechar\')]";
}
