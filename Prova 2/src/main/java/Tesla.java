public class Tesla extends Carro implements Ligar, Desligar{

    private boolean eletrico;
    private int potencia;

    public Tesla(String nome, String cor, boolean carroDisponivel, boolean eletrico, int potencia) {
        super(nome, cor, carroDisponivel);
        this.eletrico = eletrico;
        this.potencia = potencia;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro " + getNome());
    }

    @Override
    public void desligarMotor() {
        System.out.println(getNome() + " desligou o motor");
    }

    @Override
    public void ligarMotor() {
        System.out.println(getNome() + " ligou o motor");
    }

}
