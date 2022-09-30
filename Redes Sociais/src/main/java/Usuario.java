public class Usuario {

    private String nome;
    private String email;

    public RedeSocial[] redesSociais;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
