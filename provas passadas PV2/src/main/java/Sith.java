public class Sith extends Personagem implements Forca{

    private boolean darth;
    private Sabre sabre = new Sabre();

    public Sith(String nome, int id, int poder) {
        super(nome, id, poder);
    }

    public boolean isDarth() {
        return darth;
    }

    public void setDarth(boolean darth) {
        this.darth = darth;
    }

    public Sabre getSabre() {
        return sabre;
    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }

    public void corromperJedi() {
        if(darth && getPoder() > 60) {
            System.out.println(getNome() + " levou um jedi para o lado negro da forca");
        } else {
            System.out.println(getNome() + " ainda nao consegue corromper jedis");
        }
     }


    @Override
    public void travarBatalha() {
        System.out.println(getNome() + " travou uma batalha contra um jedi");
        setPoder(getPoder() + 1);
        System.out.println("Poder apos a batalha: " + getPoder());
    }

    @Override
    public void usarForca() {
        System.out.println(getNome() + " usou o lado negro da forca");
        setPoder(getPoder() + 3);
        System.out.println("Poder apos usar a forca: " + getPoder());
    }

    @Override
    public void trocarSabre(String cor) {
        sabre.setCor(cor);
    }
}
