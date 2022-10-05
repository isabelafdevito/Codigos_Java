public class PacMan extends Personagem{

    private int pontuacao;
    private int vidas=5;

    public int getVidas() {
        return vidas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void perdeVida() {
        vidas--;
    }

    public void ganhaPonto() {
        pontuacao++;
    }

    @Override
    public void movePraCima() { System.out.println("PacMan se moveu para cima");}

    @Override
    public void movePraBaixo() {
        System.out.println("PacMan se moveu para baixo");
    }

    @Override
    public void movePraEsquerda() {
        System.out.println("PacMan se moveu para a esquerda");
    }

    @Override
    public void movePraDireita() {
        System.out.println("PacMan se moveu para a direita");
    }

}
