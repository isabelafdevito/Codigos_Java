public class Troll extends Personagem implements CombateADistancia, Horda{

    private String tamanhoDaPresa;

    public Troll(double vida, String nome, String classe) {
        super(vida, nome, classe);
    }

    public String getTamanhoDaPresa() {
        return tamanhoDaPresa;
    }

    public void setTamanhoDaPresa(String tamanhoDaPresa) {
        this.tamanhoDaPresa = tamanhoDaPresa;
    }

    public String regenerar() {
        return "regenerando";
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
        System.out.println("O tamanho da presa do troll " + getNome() + " eh: " + tamanhoDaPresa);
    }

    @Override
    public void castarSpell() {
        System.out.println("Castando totem");
    }

    @Override
    public void forTheHorde() {
        System.out.println("Pela Horda!");
    }

    @Override
    public void invadirAlianca() {
        System.out.println("Invadindo Stormwind");
    }
}
