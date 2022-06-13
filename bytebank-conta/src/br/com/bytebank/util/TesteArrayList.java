package br.com.bytebank.util;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Cliente cliente = new Cliente();
        cliente.setNome("Tati");
        lista.add(cliente);

        Conta cc = new ContaCorrente(11,22);

        ContaPoupanca cp = new ContaPoupanca(123,012);

        ContaCorrente cc2 = new ContaCorrente(123,1234);

        lista.add(cc);
        lista.add(cp);
        lista.add(cc2);

        Conta conta = (Conta)lista.get(2);

        System.out.println(  conta.toString());



    }
}
