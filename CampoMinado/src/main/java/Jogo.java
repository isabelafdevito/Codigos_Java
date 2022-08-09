public class Jogo {
    Tabuleiro tab;

    public Jogo () {
        tab = new Tabuleiro();
        Jogar();
    }
    int rodada=0;
    boolean terminar = false;
    public void Jogar() {
        do {
            rodada++;
            System.out.println("Rodada " + rodada);
            tab.exibeTabuleiro();
            terminar = tab.setPosicao();
            if (!(terminar)) {
                tab.abrirVizinhas();
                terminar = tab.ganhou();
            }
        } while(!(terminar));
        if(!tab.ganhou()){
            System.out.println("Havia uma mina ! Você perdeu!");
            tab.exibeMinas();
        } else {
            System.out.println("Parabéns, você deixou os 8 campos de minas livres em "+rodada+" rodadas");
            tab.exibeMinas();
        }

    }

}
