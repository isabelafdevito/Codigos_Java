public class ClassePrincipal {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Isabela", "isabela@gmail.com");
        u1.redesSociais = new RedeSocial[2];

        Facebook f1 = new Facebook("12345", 100);
        u1.redesSociais[0] = f1;

        Twitter t1 = new Twitter("54321", 30);
        u1.redesSociais[1] = t1;


        System.out.println("Informacoes do usuario: ");
        System.out.println("Nome: " + u1.getNome());
        System.out.println("Email: " + u1.getEmail());

        System.out.println();

        for (int i = 0; i < u1.redesSociais.length; i++) {
            if (u1.redesSociais[i] != null) {

                if (u1.redesSociais[i] instanceof Facebook) {
                    Facebook f = (Facebook) u1.redesSociais[i];

                    f.compartilhar();
                    f.curtirPublicacao();
                    f.fazStreaming();
                    f.postarComentario();
                    f.postarFoto();
                    f.postarVideo();


                } else if (u1.redesSociais[i] instanceof Twitter) {
                    Twitter t = (Twitter) u1.redesSociais[i];

                    t.compartilhar();
                    t.curtirPublicacao();
                    t.postarComentario();
                    t.postarFoto();
                    t.postarVideo();

                } else if (u1.redesSociais[i] instanceof Instagram) {
                    Instagram in = (Instagram) u1.redesSociais[i];

                    in.curtirPublicacao();
                    in.postarComentario();
                    in.postarFoto();
                    in.postarVideo();

                } else if (u1.redesSociais[i] instanceof GooglePlus) {
                    GooglePlus g = (GooglePlus) u1.redesSociais[i];

                    g.compartilhar();
                    g.curtirPublicacao();
                    g.postarComentario();
                    g.postarFoto();
                    g.postarVideo();
                    g.fazStreaming();
                }

            }
            System.out.println();

        }
    }
}
