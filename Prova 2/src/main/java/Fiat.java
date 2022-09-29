public class Fiat extends Carro implements Posto, Ligar, Desligar{

    private boolean popular;
    private int capacidadeMaxima;

    public Fiat(String nome, String cor, boolean carroDisponivel, boolean popular, int capacidadeMaxima) {
        super(nome, cor, carroDisponivel);
        this.popular = popular;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void pegarPassageiro() {
        System.out.println("Passageiro a bordo no carro " + getNome());
    }

    @Override
    public void desligarMotor() {
        System.out.println(getNome() + " desligou o motor");
    }

    @Override
    public void ligarMotor() {
        System.out.println(getNome() + " ligou o motor");
    }

    @Override
    public void abastecer() {
        System.out.println("Carro abastecido");
    }
}
