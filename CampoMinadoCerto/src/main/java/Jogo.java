public class Jogo {
    Tabuleiro tab;
    int rodada=0;
    boolean terminar = false;
    boolean ganhou = false;

    public Jogo () {
        tab = new Tabuleiro();
        Jogar();
    }
    public void Jogar() {
        tab.exibeTabuleiro();
        do {
            rodada++;
            System.out.println("Rodada " + rodada);
            terminar = tab.setPosicao();
            if (!(terminar)) {
                if(rodada==1)
                    tab.exibirDicas();
                tab.exibeTabuleiro();
                terminar = tab.ganhou();
            }
        } while(!(terminar));
        if(!tab.ganhou()){
            System.out.println("Havia uma mina ! Voce perdeu!");
            tab.exibeMinas();
        } else {
            System.out.println("Parabens, voce deixou os 10 campos de minas livres");
            tab.exibeMinas();
        }

    }

}

