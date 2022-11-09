import java.io.*;
import java.util.ArrayList;

public class Arquivo
{
    public void escrever(Funcionario f)
    {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try
        {
            os = new FileOutputStream("Funcionario.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            String linhaEscrever;

            bw.write("Funcionario");// Parametro de leitura
            bw.newLine();
            bw.write(f.nome + "\n");
            bw.write(f.idade + "\n");
            bw.write(f.CPF + "\n");

        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {
            try {
                // tentar fechar a entrada dedados pra não enviar lixo
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Funcionario> ler()
    {
        ArrayList<Funcionario> acheiNoArquivo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;


        try{

            is = new FileInputStream("Funcionario.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null)
            {
                if(linhaLer.contains("Funcionario"))
                {
                    Funcionario aux = new Funcionario();

                    aux.nome = br.readLine();
                    aux.idade = Integer.parseInt(br.readLine());
                    aux.CPF = br.readLine();
                    acheiNoArquivo.add(aux);

                }
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            try
            {
                br.close();
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }

        return acheiNoArquivo;
    }

}
