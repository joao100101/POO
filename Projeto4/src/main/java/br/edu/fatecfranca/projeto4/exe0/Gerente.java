package br.edu.fatecfranca.projeto4.exe0;
public class Gerente extends Funcionario{
    
    private float bonificacao;

    public Gerente(){
        super();
    }
    
    public Gerente(float bonificacao, int codigo, String nome, String cpf, 
            float salario, float cargaHoraria) {
        super(codigo, nome, cpf, salario, cargaHoraria); 
        this.bonificacao = bonificacao;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonificacao=" + bonificacao + 
                super.toString() + '}';
    }
    
    @Override
    public float calculaSalario(){
        return this.salario + this.bonificacao;
    }
    
}
