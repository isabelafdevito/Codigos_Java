public class Pepperoni extends Pizza{
    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Pepperoni e Mussarela");
    }

    @Override
    public String mostraBrinde() {
        return "Caneta";
    }
}
