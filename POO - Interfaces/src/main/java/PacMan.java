public class PacMan extends Personagem {

    private int pontuacao;
    private int vidas;

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void perdeVida() {};
    public void ganhaPonto() {};

}
