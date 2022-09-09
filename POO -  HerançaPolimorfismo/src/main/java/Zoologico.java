public class Zoologico {

    Animal[] animal = new Animal[10];

    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }



    public String getEndereco() {
        return endereco;
    }


    public Zoologico(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
}
