package me.joao.exe1;

import me.joao.exe0.Empregado;
import me.joao.exe0.Pessoa;

public class TestaPessoaCidade {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        Cidade rp = new Cidade();
        rp.contrata(fulano);
        rp.contrata((Empregado) fulano);
        rp.cobraDe(fulano);
        rp.registra(fulano);
        rp.alimentar(fulano);
    }
}
