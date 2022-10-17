package me.joao.exe1;

import me.joao.exe0.Pessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setCPF("123.456.789-10");
        p.setRG("12.345.678-90");

        p.ensina();
        p.pagaIR();
        System.out.println(p.getCPF());
        System.out.println(p.getRG());
        p.trabalha();
        p.vota();
        p.come();
        p.respira();
    }
}
