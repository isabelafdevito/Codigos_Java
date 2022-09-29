public abstract class Carro {

    private String nome;
    private int id;
    private String cor;
    private boolean carroDisponivel;
    private static int cont;

    // construtor para definir os valores:
    public Carro(String nome, String cor, boolean carroDisponivel) {
        this.nome = nome;
        this.cor = cor;
        this.carroDisponivel = carroDisponivel;
        cont++;
        this.id = cont;
    }

    // metodos getters e setters para cada variavel:

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCarroDisponivel() {
        return carroDisponivel;
    }

    public void setCarroDisponivel(boolean carroDisponivel) {
        this.carroDisponivel = carroDisponivel;
    }


    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Carro.cont = cont;
    }


    public void mostraInfo() {
        System.out.println("Informacoes do carro: ");
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Cor: " + cor);
        if(carroDisponivel) {
            System.out.println("O carro esta disponivel");
        } else {
            System.out.println("O carro nao esta disponivel");
        }
    }

    public void venderCarro() {
        if(carroDisponivel) {
            System.out.println("Carro vendido");
        } else {
            System.out.println("Carro indisponivel");
        }
    }
}
