public class PublicaConteudo implements NotificadoraDeAcoes, AcoesDeVideo {
    private Inscrito inscrito;
    private String acao;

    public PublicaConteudo(Inscrito inscrito) {
        this.inscrito = inscrito;
    }

    @Override
    public void criaVideo(Acao acao) {
        acao = Acao.CRIACAO;
        System.out.println("Video criado");
        notificaMudanca(acao);
    }

    @Override
    public void notificaMudanca(Acao acao) {
        this.inscrito.update(acao);
    }
}
