import java.util.Random;
import java.util.Scanner;
public class Tabuleiro {

    // matriz para definir as posicoes do campo minado:
    char[][] matriz;
    boolean[][] escolhido = new boolean[10][10];
    //matriz para definicao das minas:
    int[][] minas;
    Random gerador = new Random();
    Scanner leitor = new Scanner(System.in);
    int linha;
    int coluna;

    public Tabuleiro() {
        minas = new int[10][10];
        matriz = new char[10][10];
        iniciaMinas();
        criaMinas();
        dicas();
        iniciaTabuleiro();
    }

    //zerando todas as posicoes do tabuleiro para começar o jogo:
    public void iniciaTabuleiro() {
        for (int i = 1; i < minas.length; i++) {
            for (int j = 1; j < minas.length; j++) {
                matriz[i][j] = '_';
            }
        }
    }

    //inicializando as minas:
    public void iniciaMinas() {
        for (int i = 1; i < minas.length; i++) {
            for (int j = 1; j < minas.length; j++) {
                minas[i][j] = 0;
            }
        }
    }


    public void escolhido() {
        for (int i = 1; i <= minas.length; i++) {
            for (int j = 1; j <= minas.length; j++) {
                escolhido[i][j] = false;
            }
        }
    }

    boolean[][] sorteado = new boolean[15][15];
    public void sorteado() {

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                sorteado[i][j] = false;
            }
        }
    }

    public void criaMinas() {
        int linha, coluna;
        for (int i = 0; i<10; i++) {
            do {
                linha = gerador.nextInt(8);
                coluna = gerador.nextInt(8);
            } while((linha==0 || coluna==0) || (sorteado[linha][coluna]));
                if (minas[linha][coluna] != -1) {
                    minas[linha][coluna] = -1;
                    sorteado[linha][coluna] = true;
                }
        }
    }

    //metodo para exibir todas as minas ao final do jogo
    public void exibeMinas() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (minas[i][j] == -1) {
                    System.out.print("* ");
                }
                else
                    System.out.print(minas[i][j]+ " ");
            }
            System.out.println();
        }
    }


    //metodo para exibir o tabuleiro a cada rodada
    public void exibeTabuleiro() {
        for(int k = 0; k < 9; k++){
            System.out.print(k+" ");
        }
        System.out.println();
        int index_linha = 1;
        for (int i = 1; i < 9; i++) {
            System.out.print(index_linha + " ");
            index_linha++;
            for (int j = 1; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }




        //preenchendo as dicas:

        public void dicas() {
            for (int i = 1; i < 9; i++) {
                for (int j = 1; j < 9; j++) {

                    for (int linha = -1; linha < 2; linha++) {
                        for (int coluna = -1; coluna < 2; coluna++) {
                            if (minas[i][j] != -1)
                                if (minas[linha + i][coluna + j] == -1)
                                    minas[i][j]++;
                        }
                    }
                }
            }
        }

        public void exibirDicas (){
            for (int i = -1; i < 2; i++)
                for (int j = -1; j < 2; j++)
                    if (minas[linha + i][coluna + j] != -1) {
                        matriz[linha + i][coluna + j] = Character.forDigit(minas[linha + i][coluna + j],10);
                        escolhido[linha + i][coluna + j] = true;
                    }
        }

        //escolhendo as posicoes:
        public boolean setPosicao () {
            do {
                do {
                    System.out.print("Escolha uma linha: ");
                    linha = leitor.nextInt();
                    System.out.print("Escolha uma coluna: ");
                    coluna = leitor.nextInt();
                    if (escolhido[linha][coluna]) {
                        System.out.println("Numero ja escolhido");
                        setPosicao();
                    }
                    if ((linha < 1 || linha > 8) || (coluna < 1 || coluna > 8)) {
                        System.out.println("Escolha numeros de 1 a 8");
                    }
                    matriz[linha][coluna]=Character.forDigit(minas[linha][coluna],10);
                    escolhido[linha][coluna]=true;
                    if(minas[linha][coluna]==0)
                        exibirDicas();
                } while (!(escolhido[linha][coluna]));
            } while ((linha < 1 || linha > 8) || (coluna < 1 || coluna > 8));
            if (minas[linha][coluna] == -1) {
                return true;
            } else
                return false;
        }


        public boolean ganhou() {
            int count = 0;
            for (int line = 1; line < 9; line++) {
                for (int column = 1; column < 9; column++) {
                    if (matriz[line][column] == '_') {
                        count++;
                    }
                }
            }
            if (count == 10)
                return true;
            else
                return false;
        }

    }



