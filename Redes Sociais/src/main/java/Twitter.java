public class Twitter extends RedeSocial implements Compartilhamento{


    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Twitter!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtiu uma publicacao no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma postagem no Twitter!");
    }

}
