public class ClassePrincipal {

    public static void main(String[] args) {

        Zoologico zoo = new Zoologico("ZooMania", "Rua Antonio, 32");

        Peixe p1 = new Peixe(2);

        zoo.animal[0] = p1;

        p1.nome = "Nemo";
        p1.cor = "Azul e laranja";
        p1.nPatas = 0;

        Leao l1 = new Leao(10);

        zoo.animal[1] = l1;

        l1.nome = "Simba";
        l1.cor = "Laranja";
        l1.nPatas = 4;

        Coruja c1 = new Coruja(30);

        zoo.animal[2] = c1;

        c1.nome = "Edwiges";
        c1.cor = "Branco";
        c1.nPatas = 2;

        Pato pa1 = new Pato(3);

        zoo.animal[3] = pa1;

        pa1.nome = "Quavo";
        pa1.cor = "Branco e laranja";
        pa1.nPatas = 2;

        // imprimindo as informações:

        System.out.println("Informacoes dos zoologicos: ");
        System.out.println("Nome: " + zoo.getNome());
        System.out.println("Endereco: " + zoo.getEndereco());

        System.out.println();

        System.out.println("Informacoes dos animais: ");
        for(int i=0;i<zoo.animal.length;i++) {
            if(zoo.animal[i]!=null) {
                if(zoo.animal[i] instanceof Coruja) {
                    System.out.println("Esse animal eh uma coruja. Altura de voo: " + ((Coruja) zoo.animal[i]).getAlturaVoo());
                }
                else if(zoo.animal[i] instanceof Leao) {
                    System.out.println("Esse animal eh um leao. Tamanho do juba: " + ((Leao) zoo.animal[i]).getTamanhoJuba());
                }
                else if(zoo.animal[i] instanceof Pato) {
                    System.out.println("Esse animal eh um pato. Tamanho do bico: " + ((Pato) zoo.animal[i]).getTamanhoBico());
                }
                else if(zoo.animal[i] instanceof Peixe) {
                    System.out.println("Esse animal eh um peixe. Numero de barbatanas: " + ((Peixe) zoo.animal[i]).getnBarbatanas());
                }
                System.out.println("Nome: " + zoo.animal[i].nome);
                System.out.println("Cor: " + zoo.animal[i].cor);
                System.out.println("Numero de patas: " + zoo.animal[i].nPatas);
                zoo.animal[i].fazBarulho();
                System.out.println();
            }
        }






    }

}
