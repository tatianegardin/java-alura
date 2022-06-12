package br.com.bytebank.modelo;
public class CalculadorDeImpostos {
	private double valor;
	
	public double getValor() {
		return this.valor;
	}
	
	public void calculadora(Tributavel t) {
		this.valor += t.tributo();
	}
}
