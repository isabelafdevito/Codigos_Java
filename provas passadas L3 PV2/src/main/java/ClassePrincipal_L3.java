public class ClassePrincipal_L3 {

    public static void main(String[] args) {

        // criando os objetos do array de personagens:
        Personagem[] p1 = new Personagem[2];
        Personagem[] p2 = new Personagem[2];

        //criando a guilda da aliança:
        Guilda guildaAlianca = new Guilda("Guilda da Alianca");
        // apontando o ponteiro membros da guilda para o array de personagem 1
        guildaAlianca.setMembros(p1);

        // criando a guilda da horda
        Guilda guildaHorda = new Guilda("Guilda da Horda");
        // apontando o ponteiro membro da guilda horda para o array de personagem 2
        guildaHorda.setMembros(p2);

        // criando os personagens da alianca:
        Humano humano = new Humano(4,"Isabela","Paladino");
        humano.setTamanhoDoCabelo("grande");

        Anao anao = new Anao(5,"Durby","Cacador");
        anao.setTamanhoDaBarba("Pequena");

        // apontando cada membro da guilda para cada respectivo personagem (polimorfismo):
        guildaAlianca.getMembros()[0] = humano;
        guildaAlianca.getMembros()[1] = anao;

        // criando os personagens da horda:
        Orc orc = new Orc(10,"Orcao","Guerreiro");
        orc.setCorDaPele("verde");

        Troll troll = new Troll(7,"Trollinh","Xama");
        troll.setTamanhoDaPresa("Medio");

        // apontando cada membro da guilda para cada respectivo personagem (polimorfismo)
        guildaHorda.getMembros()[0] = orc;
        guildaHorda.getMembros()[1] = troll;

        // mostrando as informacoes das guildas e dos personagens
        guildaAlianca.mostraInfo();
        System.out.println();

        for(int i=0;i<guildaAlianca.getMembros().length;i++) {
            if(guildaAlianca.getMembros()[i] != null) {
                if(guildaAlianca.getMembros()[i] instanceof Humano) {

                    Humano h = (Humano) guildaAlianca.getMembros()[i];
                    h.mostraInfo();
                    h.entrarEmRaid();
                    h.entrarEmPvP();
                    h.motivar();
                    h.forTheAlliance();
                    h.invadirHorda();
                    h.sacarArma();

                } else if (guildaAlianca.getMembros()[i] instanceof Anao) {

                    Anao a = (Anao) guildaAlianca.getMembros()[i];
                    a.mostraInfo();
                    a.entrarEmRaid();
                    a.entrarEmPvP();
                    a.endurecer();
                    a.forTheAlliance();
                    a.invadirHorda();
                    a.castarSpell();
                }
            }
            System.out.println();
        }

        System.out.println();

        guildaHorda.mostraInfo();
        System.out.println();

        for(int i=0;i<guildaHorda.getMembros().length;i++) {
            if(guildaHorda.getMembros()[i] != null) {
                if(guildaHorda.getMembros()[i] instanceof Orc) {
                    Orc o = (Orc) guildaHorda.getMembros()[i];
                    o.mostraInfo();
                    o.entrarEmRaid();
                    o.entrarEmPvP();
                    o.enfurecer();
                    o.forTheHorde();
                    o.invadirAlianca();
                    o.sacarArma();

                } else if (guildaHorda.getMembros()[i] instanceof Troll) {
                    Troll t = (Troll) guildaHorda.getMembros()[i];
                    t.mostraInfo();
                    t.entrarEmRaid();
                    t.entrarEmPvP();
                    t.regenerar();
                    t.forTheHorde();
                    t.invadirAlianca();
                    t.castarSpell();
                }
            }
            System.out.println();
        }

    }

}
