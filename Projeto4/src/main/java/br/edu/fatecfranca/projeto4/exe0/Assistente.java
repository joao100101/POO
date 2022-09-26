package br.edu.fatecfranca.projeto4.exe0;

public class Assistente extends Funcionario {
    
    private float horasExtras;
    private String quemAssiste;
    
    public Assistente(){
        super();
    }

    public Assistente(float horasExtras, String quemAssiste, int codigo, String nome, 
            String cpf, float salario, float cargaHoraria) {
        super(codigo, nome, cpf, salario, cargaHoraria);
        this.horasExtras = horasExtras;
        this.quemAssiste = quemAssiste;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getQuemAssiste() {
        return quemAssiste;
    }

    public void setQuemAssiste(String quemAssiste) {
        this.quemAssiste = quemAssiste;
    }

    @Override
    public String toString() {
        return "Assistente{" + "horasExtras=" + horasExtras + 
                ", quemAssiste=" + quemAssiste + super.toString() + '}';
    }
    
    
    
}
