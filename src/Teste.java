public class Teste {
    public static void main(String[] args) {
        Inscrito inscrito = new Inscrito();
        PublicaConteudo publicaConteudo = new PublicaConteudo(inscrito);

        publicaConteudo.criaVideo(Acao.CRIACAO);
    }
}
