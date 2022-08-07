public class Tabuleiro {
    // definindo a matriz 3x3 que sera o "tabuleiro" do jogo:
    int[][] matriz = new int[3][3];

    //zerando todas as posiçoes do tabuleiro para começar o jogo:
    public void zerandoTabuleiro(){
        for(int i=0;i<3;i++) { //linha
            for(int j=0;j<3;j++){ //coluna
                matriz[i][j]=0;
            }
        }
    }
    // funcao para mostrar o tabuleiro em andamento do jogo a cada rodada;
    public void mostraTabuleiro() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //se aquela posicao nao tiver sido escolhida, a matriz nao retorna nada
                if(matriz[i][j]==0) {
                    System.out.print(" ");
                }
                // se aquela posicao tiver sido ja escolhida pelo jogador X, imprime o X
                if(matriz[i][j]==1){
                    System.out.print("X");
                }
                // se aquela posicao tiver sido ja escolhida pelo jogador Y, imprime o O
                else if(matriz[i][j]==-1){
                    System.out.print("O");
                }
                //printando a barra para separar as posicoes
                if(j==0||j==1){
                    System.out.print("|");
                }
            }
            System.out.println();
        }

    }

    //colocando X ou O para cada posicao dependendo do jogador usando metodo setter
    // o vetor posicao ira definir a linha e a coluna onde sera preenchido o X ou o O
    // a variavel jogador é pra definir qual é o jogador da vez
    public void setPosicao(int[] posicao, int jogador) {
        // jogador 1 joga como X
        if(jogador == 1) {
            matriz[posicao[0]][posicao[1]] = 1;
        }
        //jogador 2 joga como -1
        else if(jogador == 2) {
            matriz[posicao[0]][posicao[1]] = -1;
        }
        //onde ta mostrando o tabuleiro pro jogo:
        mostraTabuleiro();
    }
// metodo para ver se a posicao esta ocupada ou nao
    // 0 -> desocupada e 1-> ocupada
    public int getPosicao(int[] posicao) {
        if(matriz[posicao[0]][posicao[1]]==0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    //metodos para checar se uma linha, coluna, ou diagonal foi completada:

    // metodo para checar se alguma linha foi completada
    public int checaLinhas(){
        for(int i=0;i<3;i++){
            int j=0;
                if(matriz[i][j]+matriz[i][j+1]+matriz[i][j+2]==3) { //jogador 1 ganhou
                    return 3;
                }
                else if(matriz[i][j]+matriz[i][j+1]+matriz[i][j+2]==-3) { //jogador 2 ganhou
                    return -3;
            }
        }
        return 0;
    }
    // metodo para checar se alguma coluna foi completada
    public int checaColunas(){
        for(int j=0;j<3;j++){
            int i=0;
            if(matriz[i][j]+matriz[i+1][j]+matriz[i+2][j]==3) { //jogador 1 ganhou
                return 3;
            }
            else if(matriz[i][j]+matriz[i+1][j]+matriz[i+2][j]==-3) { //jogador 2 ganhou
                return -3;
            }
        }
        return 0;
    }

    //metodo para checar se alguma diagonal foi completada
    public int checaDiagonal(){
        if(matriz[0][0]+matriz[1][1]+matriz[2][2]==3) { //jogador 1 ganhou
            return 3;
        }
        else if(matriz[0][0]+matriz[1][1]+matriz[2][2]==-3) { //jogador 2 ganhou
            return -3;
        }
        else if(matriz[0][2]+matriz[1][1]+matriz[2][0]==3) { //jogador 1 ganhou
            return 3;
        }
        else if(matriz[0][2]+matriz[1][1]+matriz[2][0]==-3) { //jogador 2 ganhou
            return -3;
        }
        return 0;
    }
    //metodo para checar se o tabuleiro esta completo ou nao para ver se deu empate
    public boolean checaJogo() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                if(matriz[i][j]==0) {
                    return false; //jogo nao acabou ainda
                }
            }
        }
        // quando o for nao achar nenhuma posicao com o valor zero, retornara true:
        return true;
    }

    //chamando o metodo zerar tabuleiro:
    public Tabuleiro(){
        zerandoTabuleiro();
    }
}
