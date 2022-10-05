public class Inimigo extends Personagem{


    @Override
    public void movePraCima() {
        System.out.println("Inimigo se moveu para cima");
    }

    @Override
    public void movePraBaixo() {
        System.out.println("Inimigo se moveu para baixo");
    }

    @Override
    public void movePraEsquerda() {
        System.out.println("Inimigo se moveu para a esquerda");
    }

    @Override
    public void movePraDireita() {
        System.out.println("Inimigo se moveu para a direita");
    }
}
