import javax.swing.*;
import java.io.*;
import java.util.Scanner;


/**
 * Created by Alunoinf_2 on 13/03/2019.
 */
public class LerArquivo {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String texto;
        Integer decisao;

        System.out.printf("Digite o texto do novo arquivo:\n");
        texto = ler.nextLine();

        FileWriter arq = new FileWriter("src/main/resources/arquivo.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.append(texto);

        arq.close();

        System.out.printf("Texto gravado com sucesso.\n");

        System.out.printf("Deseja imprimir? (1 - Sim, 2 - Não) ");
        decisao = ler.nextInt();

        if (decisao == 1){
            FileReader leitura = new FileReader("src/main/resources/arquivo.txt");
            BufferedReader reader = new BufferedReader(leitura);
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }
        }
    }
}
