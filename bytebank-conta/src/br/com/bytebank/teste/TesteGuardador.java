package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TesteGuardador {

    public static void main(String[] args) {

    GuardadorDeReferencias lista = new GuardadorDeReferencias();

    Cliente cliente = new Cliente();
    cliente.setNome("Tati");
    lista.adiciona(cliente);

    Conta cc = new ContaCorrente(11,22);

    ContaPoupanca cp = new ContaPoupanca(123,012);

    ContaCorrente cc2 = new ContaCorrente(123,1234);

    lista.adiciona(cc);
    lista.adiciona(cp);
    lista.adiciona(cc2);

    System.out.println(lista.getQuantidade());
    
    }


}
