public class Nave {

    public Nave(String nome, Personagem[] personagem, boolean velocidadeLuz) {
        this.nome = nome;
        this.personagem = personagem;
        this.velocidadeLuz = velocidadeLuz;
    }

    private String nome;
    public Personagem[] personagem;
    private boolean velocidadeLuz;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVelocidadeLuz() {
        return velocidadeLuz;
    }

    public void setVelocidadeLuz(boolean velocidadeLuz) {
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo() {
        System.out.println("Informacoes da nave: ");
        System.out.println("Nome: " + getNome());
        if(isVelocidadeLuz()) {
            System.out.println("Nave viaja na velocidade da luz");
        }
        else {
            System.out.println("Nave nao viaja na velocidade da luz");
        }
    }

}
