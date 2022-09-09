public class Coruja extends Animal{

    private int alturaVoo;

    public Coruja(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }

    public int getAlturaVoo() {
        return alturaVoo;
    }

    @Override
    public void fazBarulho() {
        System.out.println("auu");
    }
}
