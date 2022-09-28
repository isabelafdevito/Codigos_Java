public class ClassePrincipal_L5 {

    public static void main(String[] args) {

        Personagem[] p1 = new Personagem[3];
        Nave n1 = new Nave("Nave-mae", p1, true);

        Jedi j1 = new Jedi("Samuel", Personagem.contador, 80);
        p1[0] = j1;

        Sith s1 = new Sith("Do mal", Personagem.contador, 3);
        p1[1] = s1;

        Droid d1 = new Droid("RXT", Personagem.contador, 10);
        p1[2] = d1;

        n1.mostraInfo();
        System.out.println();
        for(int i=0;i<n1.personagem.length; i++) {
            if(n1.personagem[i] != null) {
                if(n1.personagem[i] instanceof Jedi) {

                    Jedi j = (Jedi) n1.personagem[i];
                    j.mostraInfo();
                    j.treinarPadawan();
                    j.travarBatalha();
                    j.usarForca();
                    j.trocarSabre("Amarelo");
                    System.out.println("Cor do sabre de luz: " + (j.getSabre().getCor()));

                } else if (n1.personagem[i] instanceof Sith) {

                    Sith s = (Sith) n1.personagem[i];

                    s.mostraInfo();
                    s.travarBatalha();
                    s.usarForca();
                    s.trocarSabre("Azul");
                    System.out.println("Cor do sabre de luz: " + (s.getSabre().getCor()));
                    s.corromperJedi();

                } else if (n1.personagem[i] instanceof Droid) {

                    Droid d = (Droid) n1.personagem[i];

                    d.mostraInfo();
                    d.hackearSistema();
                    d.travarBatalha();
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de personagens criados: " + (Personagem.contador));

    }
}
