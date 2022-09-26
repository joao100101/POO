package br.edu.fatecfranca.projeto4.exe0;

import javax.swing.JOptionPane;

public class Diretor extends Funcionario {
    
    private String partLucros;
    
    public Diretor(){
        super();
    }

    public Diretor(String partLucros, int codigo, String nome, String cpf, float salario, float cargaHoraria) {
        super(codigo, nome, cpf, salario, cargaHoraria);
        this.partLucros = partLucros;
    }

    public String getPartLucros() {
        return partLucros;
    }

    public void setPartLucros(String partLucros) {
        this.partLucros = partLucros;
    }
    
    @Override
    public float calculaSalario(){
        float lucro = Float.parseFloat(JOptionPane.showInputDialog("Digite o lucro da empresa: "));
        float partLucoAux = Float.parseFloat(this.partLucros);
        //converter string para float
        return this.salario + ((lucro * partLucoAux)/100);
    }

    @Override
    public String toString() {
        return "Diretor{" + "partLucros= " + partLucros + super.toString() + '}';
    }
    
    
}
