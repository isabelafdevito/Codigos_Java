import java.util.Random;

public class ClassePrincipal {

    public static void main(String[] args) {

        int[][] jogo = new int[100][100];

        Personagem[] p = new Personagem[5];
        PacMan pc = new PacMan();
        p[0] = pc;

        Inimigo[] inimigo = new Inimigo[4];
        inimigo[0] = new Inimigo();
        inimigo[1] = new Inimigo();
        inimigo[2] = new Inimigo();
        inimigo[3] = new Inimigo();
        p[1]=inimigo[0];
        p[2]=inimigo[1];
        p[3]=inimigo[2];
        p[4]=inimigo[3];

        p[0].posicaoY = 50;
        p[0].posicaoX = 50;

        inimigo[0].posicaoX=0;
        inimigo[0].posicaoY=0;

        inimigo[1].posicaoX=99;
        inimigo[1].posicaoY=0;

        inimigo[2].posicaoX=0;
        inimigo[2].posicaoY=99;

        inimigo[3].posicaoX=99;
        inimigo[3].posicaoY=99;

        int[] num = new int[5];

        while(pc.getVidas()!=0) {

            Random rg = new Random();
            num[0] = rg.nextInt(3);
            num[1] = rg.nextInt(3);
            num[2] = rg.nextInt(3);
            num[3] = rg.nextInt(3);
            num[4] = rg.nextInt(3);

            for(int i=0;i<p.length;i++) {
                // se o numero aleatorio for 0 o personagem desce
                if(num[i] == 0) {
                    if(p[i].posicaoX<99) {
                        p[i].posicaoX++;
                        p[i].movePraBaixo();
                    }
                }
                else if(num[i]==1) {
                    if(p[i].posicaoX>0) {
                        p[i].posicaoX--;
                        p[i].movePraCima();
                    }
                }
                else if(num[i]==2) {
                    if(p[i].posicaoY<99) {
                        p[i].posicaoY++;
                        p[i].movePraDireita();
                    }
                }
                else if(num[i]==3) {
                    if(p[i].posicaoY>0) {
                        p[i].posicaoY--;
                        p[i].movePraEsquerda();
                    }
                }

                }
            int x=0;
            for(int j=1;j<p.length;j++) {
                if(p[0].posicaoX == p[j].posicaoX && p[0].posicaoY == p[j].posicaoY) {
                    pc.perdeVida();
                    x++;
                }
            }
            if(x==0) {
                pc.ganhaPonto();
            }
            System.out.println("Posicao do PacMan-> Linha: " + p[0].posicaoX + " Coluna: " + p[0].posicaoY);
            for(int k=1;k<p.length;k++) {
                System.out.println("Posicao do inimigo " + k + " = linha: " + p[k].posicaoX + " Coluna: " + p[k].posicaoY);
            }
            System.out.println("Quantidade de vidas: " + pc.getVidas());
            System.out.println("Quantidade de pontos: " + pc.getPontuacao());

        }

        System.out.println("Game Over");
        System.out.println("Pontuacao final: " + pc.getPontuacao());


    }

}
