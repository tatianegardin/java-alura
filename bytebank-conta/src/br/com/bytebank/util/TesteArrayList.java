package br.com.bytebank.util;

import br.com.bytebank.modelo.*;

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

    public static class TesteGuardador {

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

        lista.getReferencia(0);

        Conta refConta = (Conta)lista.getReferencia(1);
        System.out.println(refConta.getNumero());


        }


    }

    public static class TesteArray {
        public static void main(String[] args) {

            //Array com tipos primitivos
            int[] idades = new int[5];

            idades[0] = 12;
            idades[1] = 13;
            idades[2] = 14;
            idades[3] = 15;
            idades[4] = 16;

            for (int i = 0 ; i <idades.length ; i++){
                System.out.println(idades[i]);
            }

            // Array com referencias

            Conta[] contas = new Conta[5];

            ContaCorrente c1 = new ContaCorrente(11,22);
            ContaCorrente c2 = new ContaCorrente(23,24);

            contas[0] = new ContaCorrente(55,66);
            contas[1] = c1;
            contas[2] = c2;
            contas[3] = c1;
            contas[4] = new ContaCorrente(123,123);



            for (int i = 0 ; i < contas.length; i++){
                System.out.println();
                System.out.println("Conta: " +contas[i].getNumero() );

            }

            //Array literal

            int[] arrayLiteral = {1,2,3,4,5};

            for (int i = 0; i< arrayLiteral.length; i++){
                System.out.println("Array Literal: " + arrayLiteral[i]);
            }

            for (int i = 0 ; i < args.length; i++){
                if(args[i] == "1"){
                    System.out.println("Te vira negão");
                }else{
                    System.out.println("não rolou");
                }
            }

        }
    }
}
