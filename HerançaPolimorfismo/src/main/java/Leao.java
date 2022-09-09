public class Leao extends Animal{

    private float tamanhoJuba;

    public Leao(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    @Override
    public void fazBarulho() {
        System.out.println("roar");
    }

}
