public class Peixe extends Animal{

    private int nBarbatanas;

    public Peixe(int nBarbatanas) {
        this.nBarbatanas = nBarbatanas;
    }

    public int getnBarbatanas() {
        return nBarbatanas;
    }
    @Override
    public void fazBarulho() {
        System.out.println("splash");
    }


}
