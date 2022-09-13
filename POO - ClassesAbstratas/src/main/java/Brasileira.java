public class Brasileira extends Pizza{



    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Mussarela, Requeijão, Presunto e Azeitona");

    }

    @Override
    public String mostraBrinde() {
        return "Chaveiro";
    }
}
