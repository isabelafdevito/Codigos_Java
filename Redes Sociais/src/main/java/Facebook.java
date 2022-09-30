public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{


    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Facebook!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtiu uma publicacao no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma postagem no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("fez um streaming no Facebook!");
    }
}
