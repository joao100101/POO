package br.edu.fatecfranca.projeto2.exe1;

public class Testa {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("123456-7", "1234-5", "Ronaldo", 0);
        cli1.depositar(1000);
        cli1.sacar(400);
        cli1.mostrar();
    }
    
}
