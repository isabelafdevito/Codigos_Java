public class PoligonoRegular {

    private int n;
    private float c;
    private float areaPoligono;

    public int getN() {
        return n;
    }

    public float getC() {
        return c;
    }

    public void setN(int n) {
        if(n!=0) {
            this.n = n;
        }
        else {
            System.out.println("O numero de lados nao pode ser zero!");
        }
    }

    public void setC(float c) {
        this.c = c;
    }


    public float getAreaPoligono() {
        return areaPoligono;
    }

    private float calculaPerimetro() {
        return n*c;
    }

    public float calculaApotema() {
        return (float) (c/2*Math.tan(Math.toRadians(180/n)));
    }

    public void calculaArea (int nLados, float cLados) {
        n = nLados;
        c = cLados;
        areaPoligono=(((calculaPerimetro())*calculaApotema())/2);
    }

}
