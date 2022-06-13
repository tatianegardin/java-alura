package br.com.bytebank.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

    public static void main(String[] args) {
        Integer idade = Integer.valueOf(22);
        Double peso = Double.valueOf(69.5);
        Float altura = Float.valueOf(1.63f);
        Character inicial = Character.valueOf('T');

        List<Number> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(idade);
        listaDeNumeros.add(peso);
        listaDeNumeros.add(altura);

        for(Number obj : listaDeNumeros){
            System.out.println(obj);
        }

        //Constantes
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.BYTES);
        System.out.println(Float.SIZE);
    }


}
