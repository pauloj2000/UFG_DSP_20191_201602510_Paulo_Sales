package br.com.pauloj2000.dsp2019.aula0508.as;


import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GerenciadorAluno{
    
    private static GerenciadorAluno instanciaGerenciadorAluno;
    
    private GerenciadorAluno()
    {
    }
    
    public static GerenciadorAluno obtenhaInstancia(){
        if (instanciaGerenciadorAluno == null){
            instanciaGerenciadorAluno = new GerenciadorAluno();
        }
        
        return instanciaGerenciadorAluno;
    }
    
    private static DataOutputStream escritorArquivo;
    
    private FileOutputStream obtenhaArquivo() throws FileNotFoundException {
        return new FileOutputStream("src/main/resources/avaliacao.dat");
    }
    
    public Aluno instancieAluno(String nome, 
                                double nota1, 
                                double nota2,
                                long matricula) 
    {
        return new Aluno(nome, nota1, nota2, matricula);
    }
    
    public void persistaAluno(Aluno aluno) throws FileNotFoundException, IOException {
        if (escritorArquivo == null) {
            escritorArquivo = new DataOutputStream(obtenhaArquivo());
        }
        escritorArquivo.writeChars(aluno.getNome());
        escritorArquivo.writeLong(aluno.getMatricula());
        escritorArquivo.writeDouble(aluno.getNota1());
        escritorArquivo.writeDouble(aluno.getNota2());
        
        escritorArquivo.flush();  
        escritorArquivo.close(); 
        System.out.println("O arquivo foi gravado com sucesso!!!");
    }
    
}