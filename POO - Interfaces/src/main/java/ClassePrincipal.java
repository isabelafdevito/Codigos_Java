public class ClassePrincipal {

    public static void main(String[] args) {

        PacMan pm = new PacMan();
        pm.setPontuacao(30);
        pm.setVidas(10);
        pm.posicaoX = 5;
        pm.posicaoY = 3;

        pm.movePraBaixo();
        pm.movePraCima();
        pm.movePraDireita();
        pm.movePraEsquerda();

        System.out.println(pm.getPontuacao());
        System.out.println(pm.getVidas());
        System.out.println(pm.posicaoX);
        System.out.println(pm.posicaoY);

    }

}
