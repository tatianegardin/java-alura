package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;

public class TesteArray {
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

        ContaCorrente[] contas = new ContaCorrente[5];

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


    }
}
