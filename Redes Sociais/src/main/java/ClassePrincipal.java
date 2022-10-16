public class ClassePrincipal {

    public static void main(String[] args) {

        RedeSocial[] rs = new RedeSocial[2];

        Usuario u1 = new Usuario(rs);
        u1.setNome("Isabela");
        u1.setEmail("isabela@gmail.com");

        Facebook f1 = new Facebook("12345", 100);
        rs[0] = f1;

        Twitter t1 = new Twitter("54321", 30);
        rs[1] = t1;


        System.out.println("Informacoes do usuario: ");
        System.out.println("Nome: " + u1.getNome());
        System.out.println("Email: " + u1.getEmail());

        System.out.println();

        for (int i = 0; i < rs.length; i++) {
            if (rs[i] != null) {

                if (rs[i] instanceof Facebook) {
                    Facebook f = (Facebook) rs[i];

                    f.compartilhar();
                    f.curtirPublicacao();
                    f.fazStreaming();



                } else if (rs[i] instanceof Twitter) {
                    Twitter t = (Twitter) rs[i];

                    t.postarComentario();
                    t.postarFoto();
                    t.postarVideo();

                } else if (rs[i] instanceof Instagram) {
                    Instagram in = (Instagram) rs[i];

                    in.curtirPublicacao();
                    in.postarComentario();
                    in.postarFoto();
                    in.postarVideo();

                } else if (rs[i] instanceof GooglePlus) {
                    GooglePlus g = (GooglePlus) rs[i];

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
