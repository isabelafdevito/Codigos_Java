public class ClassePrincipal {

    public static void main(String[] args) {

        Concessionaria c1 = new Concessionaria("Carros Isabela");

        Fiat f1 = new Fiat("Fiat", "Vermelho", true, false, 4);
        c1.carros[0] = f1;

        Honda h1 = new Honda("Honda", "Branco", false, true, false);
        c1.carros[1] = h1;

        Tesla t1 = new Tesla("Tesla", "Azul", true, false, 30);
        c1.carros[2] = t1;

        // mostrando as informacoes dos carros e da concessionaria:
        c1.mostraInfo();

        System.out.println();

        for(int i = 0; i<c1.carros.length;i++) {
            if(c1.carros[i] != null) {

                if(c1.carros[i] instanceof Fiat) {

                    Fiat f = (Fiat)c1.carros[i];
                    f.mostraInfo();
                    f.pegarPassageiro();
                    f.abastecer();
                    f.ligarMotor();
                    f.desligarMotor();
                    f.venderCarro();

                }

                else if(c1.carros[i] instanceof Honda) {

                    Honda h = (Honda)c1.carros[i];
                    h.mostraInfo();
                    h.abastecer();
                    h.ligarMotor();
                    h.desligarMotor();
                    h.venderCarro();

                }

                else if(c1.carros[i] instanceof Tesla) {

                    Tesla t = (Tesla)c1.carros[i];
                    t.mostraInfo();
                    t.acelerar();
                    t.desligarMotor();
                    t.ligarMotor();
                    t.venderCarro();

                }


            }

            System.out.println();
        }

        System.out.println("Quantidade de carros na concessionaria: " + Carro.getCont());


    }

}
