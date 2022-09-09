public class ClassePrincipal {


    public static void main(String[] args) {

        Robo r1 = new Robo(true);
        Robo r2 = new Robo(false);

        r1.c1.setCor("Azul");
        r1.c1.setTipo("Mini-sumo");
        r1.setSerialNumber(1);

        r1.p1.setMarca("Intel");
        r1.p1.setFrequenciaProcessamento(500);

        r2.c1.setCor("Vermelho");
        r2.c1.setTipo("Futebol");
        r2.setSerialNumber(2);

        r2.p1.setMarca("AMD");
        r2.p1.setFrequenciaProcessamento(750);

        r1.mostraConfigRobo();
        System.out.println("-------");
        r2.mostraConfigRobo();
        System.out.println("--------");
        System.out.println("Quantidade de robos criados: " + Robo.getSerialNumberGenerator());




    }


}
