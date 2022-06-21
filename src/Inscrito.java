public class Inscrito implements Observador, AcoesDoInscrito {
    @Override
    public void assistirVideo() {
        System.out.println("Video assistido");
    }

    @Override
    public void update(Acao acao) {
        if(Acao.CRIACAO.equals(acao)) {
            assistirVideo();
        }
    }

}
