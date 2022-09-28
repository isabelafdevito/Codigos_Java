public abstract class Personagem {

    public static int contador = 0;

    public Personagem(String nome, int id, int poder) {
        this.nome = nome;
        this.id = id;
        this.poder = poder;
        contador++;
        this.id = contador;
    }

    private String nome;
    private int id;
    private int poder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void mostraInfo() {
        System.out.println("Informacoes do personagem: ");
        System.out.println("Nome: " + getNome());
        System.out.println("ID: " + getId());
        System.out.println("Poder: " + getPoder());
    }

    public abstract void travarBatalha ();
}
