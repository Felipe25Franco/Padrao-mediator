public class Rh implements Setor{
    private static Rh instancia = new Rh();
    private Rh() {}
    public static Rh getInstancia() {
        return instancia;
    }

    public String receberSolicitacao(String mensagem) {
        return "O RH rebedeu a solicitação: " + mensagem;
    }

    public String receberFeedback(String mensagem) {
        return "O RH recebeu o feedback: " + mensagem;
    }

    public String receberRelatorio(String mensagem) {
        return "O RH recebeu o relatorio: " + mensagem;
    }
}
