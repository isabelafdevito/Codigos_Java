public class Jogo {

    //criando um novo tabuleiro para o jogo:
    Tabuleiro tab;
    // construtor para definir o jogo:
    public Jogo() {
        tab = new Tabuleiro();
        //while para enquanto metodo jogar retornar true ele continuar acontecendo
        while(Jogar());
    }

    int rodada = 1;
    int vez = 1;

//metodo para ver de quem é a vez de jogar
    // se a divisao da vez por 2 retornar 1 significa que o numero eh impar e é a vez do jogador 1
    public int vez(){
        if(vez%2 == 1)
            return 1;
        else
            return 2;
    }

//numerando os jogadores 1 e 2:
    Jogador jogador1 = new Jogador(1);
    Jogador jogador2 = new Jogador(2);

    //metodo para ver se alguem ja ganhou ou nao
    //classe publica para poder ser acessada de qualquer outra classe
    public int ganhouJogo(){
        //checando se o jogador X ganhou:
        if(tab.checaColunas() == 3){
            return 3;
        }
        if(tab.checaLinhas() == 3) {
            return 3;
        }
        if(tab.checaDiagonal() == 3) {
            return 3;
        }

        //checando se o jogador O ganhou
        if(tab.checaDiagonal() == -3) {
            return 6;
        }
        if(tab.checaLinhas() == -3) {
            return 6;
        }
        if(tab.checaColunas() == -3) {
            return 6;
        }
        //se ninguem tiver ganhado ainda:
        return 0;
    }

    //metodo para receber como o tabuleiro está
    // classe publica para poder ser acessada de qualquer outra classe
    public boolean Jogar() {
        //enquanto o ganhou retornar 0, o jogo pode continuar:
        if (ganhouJogo() == 0) {
            System.out.println("------------");
            System.out.println("Rodada " + rodada);
            System.out.println("Vez do jogador " + vez());

            if (vez() == 1) { //vez do jogador 1
                //chama o metodo jogar o tabuleiro para o jogador 1:
                jogador1.jogar(tab);
            } else {
                jogador2.jogar(tab);
            }
            if (tab.checaJogo() && ganhouJogo()==0) { // se o jogo tiver acabado pois todas as posicoes estao preenchidas:
                System.out.println("Deu empate!");
                return false;
            }
            vez++;
            rodada++;
            return true; // se o jogo nao tiver acabado, ele retorna true
        }
        else {
            if (ganhouJogo()==3) {
                System.out.println("Jogador 1 ganhou!");
            }
            else
                System.out.println("Jogador 2 ganhou!");
        }
        return false; // quando alguem ganhar, ele retona false e acaba o jogo
    }


}
