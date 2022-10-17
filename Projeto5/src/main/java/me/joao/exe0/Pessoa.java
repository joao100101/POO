package me.joao.exe0;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {
    private String rg;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    @Override
    public void vota() {
        System.out.println("Votou");
    }

    @Override
    public String getRG() {
        return rg;
    }

    @Override
    public void pagaIR() {
        System.out.println("Imposto pago");
    }

    @Override
    public String getCPF() {
        return cpf;
    }

    @Override
    public void trabalha() {
        System.out.println("Trabalhou");
    }

    @Override
    public void ensina() {
        System.out.println("Ensinou");
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setRG(String rg){
        this.rg = rg;
    }
}
