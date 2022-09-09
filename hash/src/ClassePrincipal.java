import java.sql.SQLOutput;
import java.util.Scanner;
public class ClassePrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto = leitor.nextLine();
        System.out.println(HASH.getHashMd5( texto ));
    }
}
