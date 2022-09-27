public class Droid extends Personagem{


    private boolean hostil;

    public Droid(String nome, int id, int poder) {
        super(nome, id, poder);
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public void hackearSistema() {
        System.out.println(getNome() + " hackeou o sistema da nave");
    }

    @Override
    public void travarBatalha() {
        if(hostil) {
            System.out.println(getNome() + " travou uma batalha contra um jedi");
        } else {
            System.out.println(getNome() + " travou uma batalha contra um sith");
        }
        setPoder(getPoder() + 1);
    }
}
