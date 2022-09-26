package br.edu.fatecfranca.projeto2.exe0;

public class Aluno {
    public int numeroAluno;
    public String nomeAluno;
    public int idade;
    public double p1;
    public double p2;
    
    public Aluno (){
        
    }
    
    public Aluno (int numeroAluno, String nomeAluno, int idade, double p1, double p2){
        
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public double notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public String dadosAluno() {
        return "Numero Aluno: " + this.numeroAluno + " Nome aluno: " + this.nomeAluno + 
        " Idade: " + this.idade + " Nota final: " + this.notaFinal();
    }
    
    public void passou(){
        if(this.notaFinal() >= 6){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }
}
