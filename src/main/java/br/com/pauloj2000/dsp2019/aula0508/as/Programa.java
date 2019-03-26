package br.com.pauloj2000.dsp2019.aula0508.as;

import java.io.IOException;
import java.util.Scanner;


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
            
            System.out.println("Os dados foram inseridos com sucesso!!\n");
            
            System.out.println("Resultado do aluno:");
            
            AprovaReprova resultado = new AprovaReprova();
            System.out.println("Resultado do aluno:");
            System.out.println(resultado.retornaResultadoAluno(nota1, nota2));
            
        } catch(IOException excecao) {
            System.out.println("Erro na leitura do arquivo\n");
            System.out.println("Foi disparada a seguinte exceção:");
            System.out.println(excecao.getMessage());
        }
    }
}