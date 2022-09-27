public class Guilda {

    private String guilda;
    private Personagem membros[];


    public Guilda(String guilda) {
        this.guilda = guilda;
    }

    public String getGuilda() {
        return guilda;
    }

    public void setGuilda(String guilda) {
        this.guilda = guilda;
    }

    public Personagem[] getMembros() {
        return membros;
    }

    public void setMembros(Personagem[] membros) {
        this.membros = membros;
    }

    public void guildRaid() {
        for(int i=0;i< membros.length;i++) {
            membros[i].entrarEmRaid();
        }
    }

    public void mostraInfo() {
        System.out.println("Informacoes da guilda: ");
        System.out.println("Nome: " + guilda);
        System.out.println("Nome dos personagens: ");
        for(int i=0;i< membros.length;i++) {
            System.out.println(membros[i].getNome());
        }
    }

}
