import java.util.Scanner;
public class Jogador {
    //vetor posicao para ver qual posicao cada jogador escolheu
    int[] posicao = new int[2];
    Scanner leitor = new Scanner(System.in);
    int jogador;
    public Jogador(int jogador){
        this.jogador = jogador; // this - para ser possivel alternar do valor 1 para o 2
    }


    //metodo para ver se tal posicao ja esta preenchida ou nao:
    public boolean checaTentativa(int[] posicao, Tabuleiro tabuleiro) {
        if(tabuleiro.getPosicao(posicao)==0) {
            return true;
        }
        else
            return false;
    }
// metodo para cada jogador escolher a posicao em que vai jogar
    // + metodo para checar se aquela posicao esta disponivel
    public void Posicao(Tabuleiro tabuleiro) {
        //do-while para checar se aquela posicao esta disponivel ou nao:
        do {
            //selecionando a linha:
            do {
                System.out.print("Selecione uma linha: ");
                posicao[0] = leitor.nextInt();

                if (posicao[0] > 3 || posicao[0] < 1) {
                    System.out.println("Linha nao existente. Tente novamente.");
                }
            } while (posicao[0] > 3 || posicao[0] < 1);
            //selecionando a coluna:
            do {
                System.out.print("Selecione uma coluna: ");
                posicao[1] = leitor.nextInt();

                if (posicao[0] > 3 || posicao[0] < 1) {
                    System.out.println("Coluna nao existente. Tente novamente.");
                }
            } while (posicao[1] > 3 || posicao[1] < 1);
            posicao[0]--;
            posicao[1]--;
            if(tabuleiro.getPosicao(posicao)==1) {
                System.out.println("Posicao ja preenchida. Tente novamente.");
            }
        } while(tabuleiro.getPosicao(posicao)==1); // 1 significa que aquela posicao esta ocupada

    }

    public void jogar(Tabuleiro tabuleiro) {
        //chamando a funcao posicao para os jogadores:
        Posicao(tabuleiro);
        tabuleiro.setPosicao(posicao,jogador);
    }
}
