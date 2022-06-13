package br.com.bytebank.util;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Cliente cliente = new Cliente();
        cliente.setNome("Tati");
        System.out.println(cliente);

        Conta cc = new ContaCorrente(11,22);

        ContaPoupanca cp = new ContaPoupanca(123,012);

        ContaCorrente cc2 = new ContaCorrente(123,1234);

        lista.add(cc);
        lista.add(cp);
        lista.add(cc2);

        for (Object ref: lista) {
            System.out.println(ref);
            System.out.println();
        }


        //Comparando se a conta já existe (Foi sobreescrito o equals na classe conta)

        Conta cc3 =  new ContaCorrente(11,22);
        System.out.println("A conta já existe? " + lista.contains(cc3));
        

    }
}
