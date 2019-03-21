public class Aluno{
    
    public String nome;

    public double nota1;

    public double nota2;

    public long matricula;
    
    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public long getMatricula() {
        return matricula;
    }

    public Aluno(String nome, double nota1, double nota2, long matricula){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.matricula = matricula;       
    }  
}