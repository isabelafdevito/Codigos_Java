public class Instagram extends RedeSocial {


    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Instagram!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtiu uma publicacao no Instagram!");
    }

}
