public class Banda {

    String nome;
    String genero;
        Empresario[] empresario;
        Musico[] musico;
        Musica[] musica;

    void mostraInfosBanda() {
        System.out.println("Nome da banda: " + nome);
        System.out.println("Genero da banca: " + genero);

        System.out.println("Nomes dos empresarios e seus CNPJs: ");
        for(int i=0;i< empresario.length;i++) {
            if(empresario[i]!=null)
            System.out.println(empresario[i].nome + " " + empresario[i].cnpj);
        }
        System.out.println();

        System.out.println("Nome dos musicos e suas funcoes: ");
        for(int j=0;j< musico.length;j++) {
            if (musico[j] != null)
                System.out.println(musico[j].nome + " eh o " + musico[j].funcao);
        }
        System.out.println();

        System.out.println("Nome das musicas e o tempo de cada uma delas: ");
        for(int p=0;p< musica.length;p++) {
            if (musica[p] != null)
                System.out.println(musica[p].nome + " demora " + musica[p].tempo + " minutos");
        }
    }

}
