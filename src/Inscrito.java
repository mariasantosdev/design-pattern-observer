public class Inscrito implements Observador, AcoesDoInscrito {
    @Override
    public void assistirVideo() {
        System.out.println("Acabou de chegar uma notificação por sininho");
    }

    @Override
    public void update(Acao acao) {
        if(Acao.CRIACAO.equals(acao)) {
            assistirVideo();
        }
    }

}
