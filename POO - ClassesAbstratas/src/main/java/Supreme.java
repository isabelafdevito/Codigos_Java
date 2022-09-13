public class Supreme extends Pizza{
    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Mussarela, Cebola, Pimentão e Azeitona");
    }

    @Override
    public String mostraBrinde() {
        return "Caneca";
    }
}
