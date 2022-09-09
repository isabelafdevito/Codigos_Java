import java.util.Scanner;
public class ClassePrincipal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        PoligonoRegular p1 = new PoligonoRegular();


        System.out.println("Insira o numero de lados:");
        p1.setN(leitor.nextInt());
        System.out.println("Insira o tamanho de cada lado:");
        p1.setC(leitor.nextFloat());


        p1.calculaArea(p1.getN(),p1.getC());

        System.out.println("Area do poligono: " + p1.getAreaPoligono());


    }
}
