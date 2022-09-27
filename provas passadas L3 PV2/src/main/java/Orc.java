public class Orc extends Personagem implements CombateCorpoACorpo, Horda{

    private String corDaPele;

    public Orc(double vida, String nome, String classe) {
        super(vida, nome, classe);
    }

    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    public String enfurecer() {
        return "enfurecendo";
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
        System.out.println("A cor da pele do Orc " + getNome() + " eh: " + corDaPele);
    }

    @Override
    public void sacarArma() {
        System.out.println("Pegando machado de duas maos");
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
