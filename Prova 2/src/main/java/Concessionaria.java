public class Concessionaria {

    private String nome;
    public Carro carros[] = new Carro[3];

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostraInfo() {
        System.out.println("Informacoes da concessionaria: ");
        System.out.println("Nome: " + nome);
    }

}
