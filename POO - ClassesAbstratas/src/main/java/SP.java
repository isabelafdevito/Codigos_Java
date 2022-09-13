public class SP extends Unidade{



    @Override
    public void mostraPizzas() {
        System.out.println("Pizzas: ");
        for(int i=0;i<p1.length;i++) {
            if(p1[i] != null) {
                p1[i].mostraIngredientes();
                System.out.println(p1[i].mostraBrinde());
                System.out.println(p1[i].preco);
            }
        }
    }
}
