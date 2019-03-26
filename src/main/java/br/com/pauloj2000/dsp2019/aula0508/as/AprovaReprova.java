package br.com.pauloj2000.dsp2019.aula0508.as;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunoinf_2
 */
public class AprovaReprova {
    
    private final int MEDIA_APROVACAO = 6; 
    
    public String retornaResultadoAluno(double nota1, double nota2){
        if(retornaResultadoAlunoBooleano(nota1,nota2))
        {
            return "Aprovado!";
        } else{
            return "Reprovado!";
        }
    }
    
    public boolean retornaResultadoAlunoBooleano(double nota1, double nota2){
        return obtenhaMediaFinal(nota1,nota2) >= MEDIA_APROVACAO;
    }
    
    public double obtenhaMediaFinal(double nota1,double nota2){
        return (nota1 + nota2) / 2;
    }
}
