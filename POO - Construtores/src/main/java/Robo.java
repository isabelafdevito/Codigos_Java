import java.util.Date;

public class Robo {

    private static long serialNumberGenerator;
    private long serialNumber;
    private Date dataCriacao;
    Processador p1 = new Processador();
    Corpo c1 = new Corpo();
    boolean processador;

    public static long getSerialNumberGenerator() {
        return serialNumberGenerator;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }


    public Robo(boolean temProcessador) {
        dataCriacao = new Date();
        processador = temProcessador;
        serialNumberGenerator++;
    }

    public void mostraConfigRobo() {
        System.out.println("Informacoes do robo");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Data da Criacao: " + dataCriacao);
        if(processador) {
            System.out.println("O robo tem processador");
            System.out.println("Marca: " + p1.getMarca());
            System.out.println("Frequencia de pocessamento: " + p1.getFrequenciaProcessamento());
        }
        else {
            System.out.println("O robo nao tem processador");
        }
        System.out.println("Tipo: " + c1.getTipo());
        System.out.println("Cor: " + c1.getCor());
    }



}
