import java.util.ArrayList;

public class ClassePrincipal {

    public static void main(String[] args) {

        Cofrinho c = new Cofrinho();

        Moeda m1 = new Moeda(50);
        Moeda m2 = new Moeda(10);
        Moeda m3 = new Moeda(25);

        c.addMoeda(m1);
        c.addMoeda(m2);
        c.addMoeda(m3);

        System.out.println("Informacoes do cofrinho: ");

        System.out.println("Valor total no cofrinho: " + c.getValorTotal());
        System.out.println("Moeda de maior valor no cofrinho: " + c.getMoedaMaiorValor().getValor());
        System.out.println("Quantidade de moedas no cofrinho: " + c.getQuantMoedas());
        System.out.println("Moedas ordenadas: ");
        c.ordenaMoedas();


    }

}
