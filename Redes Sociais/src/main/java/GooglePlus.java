public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{


    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Google Plus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Google Plus!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtiu uma publicacao no Google Plus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma postagem no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("fez um streaming no Google!");
    }
}
