public class Humano extends Personagem implements Alianca, CombateCorpoACorpo{


    private String tamanhoDoCabelo;

    public Humano(double vida, String nome, String classe) {
        super(vida, nome, classe);
    }

    public String getTamanhoDoCabelo() {
        return tamanhoDoCabelo;
    }

    public void setTamanhoDoCabelo(String tamanhoDoCabelo) {
        this.tamanhoDoCabelo = tamanhoDoCabelo;
    }

    public String motivar() {
        return "Motivando";
    }
    @Override
    public void entrarEmRaid() {
        System.out.println(getNome() + " entrando em raid");
    }

    @Override
    public void entrarEmPvP() {
        System.out.println(getNome() + " entrando em arena PvP");
    }

    @Override
    public void mostraInfo() {
        System.out.println("O tamanho do cabelo do humano " + getNome() + " eh: " + tamanhoDoCabelo);
    }

    @Override
    public void forTheAlliance() {
        System.out.println("Pela Alianca!");
    }

    @Override
    public void invadirHorda() {
        System.out.println("Invadindo Orgrimmar");
    }

    @Override
    public void sacarArma() {
        System.out.println("Desembainhando espada");
    }
}
