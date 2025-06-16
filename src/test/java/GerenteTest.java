import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GerenteTest {

    @Test
    void deveSolicitarRh() {
        Gerente gerente = new Gerente();
        assertEquals("A Ouvidoria agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH recebeu solicitação: Favor gerar folha de ponto",
                gerente.receberSolicitacao("Favor gerar folha de ponto"));
    }

    @Test
    void deveDarFeedbackRh() {
        Gerente gerente = new Gerente();
        assertEquals("A Ouvidoria agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH vai procurar melhorar o serviço de feedback: Feedback mal elaborado",
                gerente.receberFeedback("Feedback mal elaborado"));
    }

    @Test
    void deveReceberRelatorioRh() {
        Gerente gerente = new Gerente();
        assertEquals("A Ouvidoria agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH vai analisar o relatorio: Relatorio de produção de funcionarios",
                gerente.receberRelatorio("Relatorio de produção de funcionarios"));
    }
}
