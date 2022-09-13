public class ClassePrincipal {

    public static void main(String[] args) {

        BH unidade_bh = new BH();
        unidade_bh.nomeResponsavel = "Isabela";
        unidade_bh.endereco = "Rua Caxias, 91";

        unidade_bh.p1[0] = new Supreme();
        unidade_bh.p1[0].preco = 25;
        unidade_bh.mostraPizzas();

    }

}
