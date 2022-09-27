public class Jedi extends Personagem implements Treinamento, Forca{

    private boolean mestre;
    private Sabre sabre = new Sabre();

    public Jedi(String nome, int id, int poder) {
        super(nome, id, poder);
    }

    public boolean isMestre() {
        return mestre;
    }

    public void setMestre(boolean mestre) {
        this.mestre = mestre;
    }

    public Sabre getSabre() {
        return sabre;
    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }

    @Override
    public void travarBatalha() {
        System.out.println(getNome() + " travou uma batalha contra um sith");
        setPoder(getPoder()+1);
        System.out.println("Poder apos a batalha: " + getPoder());
    }

    @Override
    public void treinarPadawan() {
        if(mestre || getPoder() > 70) {
            System.out.println(getNome() + " treinou um padawan");
        } else {
            System.out.println(getNome() + " ainda nao consegue treinar padawans");
        }
    }

    @Override
    public void usarForca() {
        System.out.println(getNome() + " usou a forca para o bem");
        setPoder(getPoder() + 5);
        System.out.println("Poder apos usar a forca: " + getPoder());

    }

    @Override
    public void trocarSabre(String cor) {
        sabre.setCor(cor);
    }
}
