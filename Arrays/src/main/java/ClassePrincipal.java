public class ClassePrincipal {
    public static void main(String[] args) {

        // arays:
        //1. quantidade de elementos pré definidos
        //2.declarado como um objeto
        //3. guarda apenas elementos de um mesmo tipo
        Banda banda = new Banda();

        Empresario[] empresario = new Empresario[1];
        Musico[] musico = new Musico[10];
        Musica[] musica = new Musica[10];
        banda.nome= "Rockstar";
        banda.genero="Rock";

        empresario[0] = new Empresario();
        banda.empresario=empresario;
        musico[0] = new Musico();
        musico[1] = new Musico();
        musico[2] = new Musico();
        banda.musico=musico;

        musica[0] = new Musica();
        musica[1] = new Musica();
        banda.musica=musica;

        // objetos de empresario:
        empresario[0].nome = "Ricardo";
        empresario[0].cnpj="17.342.7267.87.12";

        //objetos de musico:
        musico[0].nome = "Adam";
        musico[0].funcao = "vocalista";

        musico[1].nome = "Sidney";
        musico[1].funcao = "guitarrista";

        musico[2].nome = "Sam";
        musico[2].funcao = "baterista";

        //objetos de musica:
        musica[0].nome = "Sing together";
        musica[0].tempo=3;

        musica[1].nome = "Better";
        musica[1].tempo=4;

        banda.mostraInfosBanda();


    }

}
