package br.edu.fatecfranca.projeto4;

import br.edu.fatecfranca.projeto4.exe0.Assistente;
import br.edu.fatecfranca.projeto4.exe0.Diretor;
import br.edu.fatecfranca.projeto4.exe0.Funcionario;
import br.edu.fatecfranca.projeto4.exe0.Gerente;
import javax.swing.JOptionPane;

public class Projeto4 {

    public static void polimorfismo(Funcionario camaleao) {

        System.out.println(camaleao.toString());

    }

    public static void verSalario(Funcionario func){
        String[] classe = func.getClass().getName().split("\\.");
        float salario = func.calculaSalario();
        System.out.println("");
        System.out.println("Exibindo salário de: " + classe[classe.length-1]);
        System.out.println(salario);
        JOptionPane.showMessageDialog(null, "Salário de " + classe[classe.length-1] + ": " + salario);
    }
    
    public static void main(String[] args) {

        Gerente objGerente = new Gerente(3000, 1, "Fulano", "123",
                1500, 44);

        polimorfismo(objGerente);

        Assistente objAssistente = new Assistente(20, "Fulano", 11, "Beltrano", "321",
                1000, 44);
        polimorfismo(objAssistente);

        Diretor objDiretor = new Diretor("5", 111, "Ciclano", "656", 5000, 44);
        polimorfismo(objDiretor);
        verSalario(objDiretor);

    }
}
