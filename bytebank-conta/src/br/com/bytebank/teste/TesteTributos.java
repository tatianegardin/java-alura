package br.com.bytebank.teste;

import br.com.bytebank.modelo.CalculadorDeImpostos;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteTributos {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 111);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImpostos tributo = new CalculadorDeImpostos();
		
		tributo.calculadora(cc);
		tributo.calculadora(sv);
		
		System.out.println(tributo.getValor());
	}

}
