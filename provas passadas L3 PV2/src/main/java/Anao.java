public class Anao extends Personagem implements Alianca, CombateADistancia{

    private String tamanhoDaBarba;

    public Anao(double vida, String nome, String classe) {
        super(vida, nome, classe);
    }

    public String getTamanhoDaBarba() {
        return tamanhoDaBarba;
    }

    public void setTamanhoDaBarba(String tamanhoDaBarba) {
        this.tamanhoDaBarba = tamanhoDaBarba;
    }

    public String endurecer() {
        return "Endurecendo";
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
        System.out.println("O tamanho da barba do anao " + getNome() + " eh: " + tamanhoDaBarba);
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
    public void castarSpell() {
        System.out.println("Atirando");
    }
}
