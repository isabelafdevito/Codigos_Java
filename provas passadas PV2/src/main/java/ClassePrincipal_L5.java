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
        for(int i=0;i<n1.personagem.length; i++) {
            if(n1.personagem[i] != null) {
                n1.personagem[i].mostraInfo();
                if(n1.personagem[i] instanceof Jedi) {
                    ((Jedi) n1.personagem[i]).treinarPadawan();
                    n1.personagem[i].travarBatalha();
                    ((Jedi) n1.personagem[i]).usarForca();
                    ((Jedi) n1.personagem[i]).trocarSabre("Amarelo");
                    System.out.println(((Jedi) n1.personagem[i]).getSabre().getCor());
                } else if (n1.personagem[i] instanceof Sith) {
                    n1.personagem[i].travarBatalha();
                    ((Sith) n1.personagem[i]).usarForca();
                    ((Sith) n1.personagem[i]).trocarSabre("Azul");
                    System.out.println(((Sith) n1.personagem[i]).getSabre().getCor());
                    ((Sith) n1.personagem[i]).corromperJedi();
                } else if (n1.personagem[i] instanceof Droid) {
                    ((Droid) n1.personagem[i]).hackearSistema();
                    n1.personagem[i].travarBatalha();
                }
            }
        }
    }
}
