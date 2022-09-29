public class Honda extends Carro implements Posto, Desligar{

    private boolean flex;
    private boolean tracao;

    public Honda(String nome, String cor, boolean carroDisponivel, boolean flex, boolean tracao) {
        super(nome, cor, carroDisponivel);
        this.flex = flex;
        this.tracao = tracao;
    }

    public void ligarMotor() {
        System.out.println(getNome() + " ligou o motor");
    }

    @Override
    public void desligarMotor() {
        System.out.println(getNome() + " desligou o motor");
    }

    @Override
    public void abastecer() {
        System.out.println("Carro abastecido");
    }

}
