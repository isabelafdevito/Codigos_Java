public class Pato extends Animal{

    private float tamanhoBico;

    public Pato(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }

    public float getTamanhoBico() {
        return tamanhoBico;
    }
    @Override
    public void fazBarulho() {
        System.out.println("quac");
    }
}
