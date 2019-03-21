
import java.io.IOException;
import java.util.Scanner;
import static sun.net.www.http.HttpClient.New;


/**
 *
 * @author Paulo Sales
 */
public class Programa {
    public static void main(String args[])  {
        try {
             GerenciadorAluno gerenciaAluno = GerenciadorAluno.obtenhaInstancia();
             Scanner scanner = new Scanner(System.in);
             
             System.out.println("Digite o nome, depois a matricula, depois a nota 1, e depois a nota 2:");
             String nome = scanner.nextLine();
             long matricula = scanner.nextLong();
             double nota1 = scanner.nextDouble();
             double nota2 = scanner.nextDouble();
             
             Aluno aluno1 = gerenciaAluno.instancieAluno(nome, nota1, nota2, matricula);
             
            gerenciaAluno.persistaAluno(aluno1);
            
        } catch(IOException excecao) {
            System.out.println("Erro na leitura do arquivo");
            excecao.printStackTrace();
        }
    }
}