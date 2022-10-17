package me.joao.exe1;

import me.joao.exe0.*;

public class Cidade {

    public void contrata(Professor p){
        p.ensina();
        p.trabalha();
    }

    public void contrata(Empregado e){
        e.trabalha();
    }

    public void cobraDe(Contribuinte c){
        c.pagaIR();
    }

    public void registra(Cidadao c){
        System.out.println(c.getRG());
    }

    public void alimentar(Animal a){
        a.come();
    }
}
