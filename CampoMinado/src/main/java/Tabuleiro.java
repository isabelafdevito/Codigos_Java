import java.util.Random;
import java.util.Scanner;
public class Tabuleiro {

    // matriz para definir as posicoes do campo minado:
    String[][] matriz = new String[10][10];
    boolean[][] sorteado = new boolean[8][8];
    boolean[][] escolhido = new boolean[8][8];
    //matriz para definicao das minas:
    int[][] minas = new int[8][8];
    Random gerador = new Random();
    Scanner leitor = new Scanner(System.in);
    int linha;
    int coluna;
    //zerando todas as posicoes do tabuleiro para começar o jogo:
    public void iniciaTabuleiro() {
        for(int i=1;i<9;i++) {
            for(int j=0;j<9;j++) {
                matriz[i][j]="_ ";
            }
        }
    }

    //inicializando as minas:
    public void iniciaMinas() {
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                minas[i][j]=0;
            }
        }
    }

    // sorteando as minas:
    public void sorteado() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sorteado[i][j] = false;
            }
        }
    }
    public void escolhido() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                escolhido[i][j] = false;
            }
        }
    }
    int linha_aux;
    int coluna_aux;
    public void criaMinas() {
        for(int i=0;i<10;i++) {
            do {
                linha_aux = gerador.nextInt(7);
                coluna_aux = gerador.nextInt(7);
            } while(!sorteado[linha_aux][coluna_aux]);
            minas[linha_aux][coluna_aux]=-1;
            sorteado[linha_aux][coluna_aux]=true;
        }
    }
    //metodo para exibir todas as minas ao final do jogo
    public void exibeMinas() {
        for(int i = 0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(minas[i][j]==-1)
                    matriz[i][j]="*";
            }
            System.out.println();
        }
    }


    //metodo para exibir o tabuleiro a cada rodada
    public void exibeTabuleiro() {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(escolhido[i][j]) {
                    if(minas[i][j]==-1) {
                        exibeMinas();
                    }
                    else {
                        abrirVizinhas();
                    }
                }
                else {
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    //preenchendo as dicas:

    public void dicas() {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {

                for(int linha=-1;linha<2;linha++) {
                    for(int coluna = -1;coluna<2;coluna++) {
                        if(minas[i][j]!=-1)
                            if(minas[linha+i][coluna+j]==-1)
                                minas[i][j]++;
                    }
                }
            }
        }
    }

    //escolhendo as posicoes:
    public boolean setPosicao() {
        do {
            do {
                System.out.print("Escolha uma linha: ");
                linha = leitor.nextInt();
                System.out.println("Escolha uma coluna: ");
                coluna = leitor.nextInt();

                if(escolhido[linha][coluna]) {
                    System.out.println("Numero ja escolhido");
                }
                if((linha<1 || linha> 8) || (coluna < 1 || coluna > 8)) {
                    System.out.println("Escolha numeros de 1 a 8");
                }
            } while(escolhido[linha][coluna]);
        } while((linha<1 || linha> 8) || (coluna < 1 || coluna > 8));
        escolhido[linha][coluna]=true;
        if(minas[linha][coluna]== -1) {
            return true;
        }
        else
            return false;
    }


    public void abrirVizinhas() {
        for(int i=-1 ; i<2 ; i++)
            for(int j=-1 ; j<2 ; j++)
                if( (minas[linha+i][coluna+j] != -1)){
                    matriz[linha+i][coluna+j]= String.valueOf(minas[linha+i][coluna+j]);
                    escolhido[linha+i][coluna+i]=true;
                }
    }

    public boolean ganhou() {
        int count=0;
        for(int line = 1 ; line < 9 ; line++)
            for(int column = 1 ; column < 9 ; column++)
                if(matriz[line][column]== "_ ")
                    count++;
        if(count == 10)
            return true;
        else
            return false;
    }

    public Tabuleiro () {
        iniciaMinas();
        criaMinas();
        dicas();
        iniciaTabuleiro();
    }

}
