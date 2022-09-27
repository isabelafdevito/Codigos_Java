public class ClassePrincipal_L3 {

    public static void main(String[] args) {

        Personagem[] p1 = new Personagem[2];
        Personagem[] p2 = new Personagem[2];
        Guilda guildaAlianca = new Guilda("Guilda da Alianca");
        guildaAlianca.setMembros(p1);
        Guilda guildaHorda = new Guilda("Guilda da Horda");
        guildaHorda.setMembros(p2
        );
        Humano humano = new Humano(4,"Isabela","Paladino");
        humano.setTamanhoDoCabelo("grande");
        Anao anao = new Anao(5,"Durby","Cacador");
        anao.setTamanhoDaBarba("Pequena");
        guildaAlianca.getMembros()[0] = humano;
        guildaAlianca.getMembros()[1] = anao;

        Orc orc = new Orc(10,"Orcao","Guerreiro");
        orc.setCorDaPele("verde");
        Troll troll = new Troll(7,"Trollinh","Xama");
        troll.setTamanhoDaPresa("Medio");
        guildaHorda.getMembros()[0] = orc;
        guildaHorda.getMembros()[1] = troll;

        guildaAlianca.mostraInfo();
        System.out.println();
        for(int i=0;i<guildaAlianca.getMembros().length;i++) {
            if(guildaAlianca.getMembros()[i] != null) {
                guildaAlianca.getMembros()[i].mostraInfo();
                guildaAlianca.getMembros()[i].entrarEmRaid();
                guildaAlianca.getMembros()[i].entrarEmPvP();
                if(guildaAlianca.getMembros()[i] instanceof Humano) {
                    ((Humano) guildaAlianca.getMembros()[i]).motivar();
                    ((Humano) guildaAlianca.getMembros()[i]).forTheAlliance();
                    ((Humano) guildaAlianca.getMembros()[i]).invadirHorda();
                    ((Humano) guildaAlianca.getMembros()[i]).sacarArma();
                } else if (guildaAlianca.getMembros()[i] instanceof Anao) {
                    ((Anao) guildaAlianca.getMembros()[i]).endurecer();
                    ((Anao) guildaAlianca.getMembros()[i]).forTheAlliance();
                    ((Anao) guildaAlianca.getMembros()[i]).invadirHorda();
                    ((Anao) guildaAlianca.getMembros()[i]).castarSpell();
                }
            }
            System.out.println();
        }

        System.out.println();

        guildaHorda.mostraInfo();
        System.out.println();
        for(int i=0;i<guildaHorda.getMembros().length;i++) {
            if(guildaHorda.getMembros()[i] != null) {
                guildaHorda.getMembros()[i].mostraInfo();
                guildaHorda.getMembros()[i].entrarEmRaid();
                guildaHorda.getMembros()[i].entrarEmPvP();
                if(guildaHorda.getMembros()[i] instanceof Orc) {
                    ((Orc) guildaHorda.getMembros()[i]).enfurecer();
                    ((Orc) guildaHorda.getMembros()[i]).forTheHorde();
                    ((Orc) guildaHorda.getMembros()[i]).invadirAlianca();
                    ((Orc) guildaHorda.getMembros()[i]).sacarArma();
                } else if (guildaHorda.getMembros()[i] instanceof Troll) {
                    ((Troll) guildaHorda.getMembros()[i]).regenerar();
                    ((Troll) guildaHorda.getMembros()[i]).forTheHorde();
                    ((Troll) guildaHorda.getMembros()[i]).invadirAlianca();
                    ((Troll) guildaHorda.getMembros()[i]).castarSpell();
                }
            }
            System.out.println();
        }

    }

}
