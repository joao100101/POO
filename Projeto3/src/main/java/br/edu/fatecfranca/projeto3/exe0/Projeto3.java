

package br.edu.fatecfranca.projeto3.exe0;

import java.util.Date;

public class Projeto3 {

    public static void main(String[] args) {
     
        Aluno objAluno = new Aluno(123, "Arnaldo");
        Disciplina objDisciplina = new Disciplina(1, "POO");
        Cursa obj = new Cursa(100, new Date(), objAluno, objDisciplina);
        System.out.println(obj.toString());
    }
}
