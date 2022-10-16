import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofrinho {

    ArrayList<Moeda> m = new ArrayList<>();

    public void addMoeda(Moeda moeda) {
        m.add(moeda);
    };

    double valor;
    public double getValorTotal() {
        for(Moeda m1 : m) {
            valor = valor + m1.getValor();
        }

        return valor;
    }

    public int getQuantMoedas() {
        return m.size();
    }
    public Moeda getMoedaMaiorValor() {
        Moeda m1 =  Collections.max(m);
        return m1;
    }


    public void ordenaMoedas() {
        Collections.sort(m);
        for(Moeda m1 : m) {
            System.out.println(m1.getValor());
        }
    }
}
