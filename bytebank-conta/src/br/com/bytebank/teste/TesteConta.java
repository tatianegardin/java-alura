package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(200);
		
		ContaPoupanca cp = new ContaPoupanca(111, 222);
		cp.deposita(200);
		
		//conta corrente desconta 0,20 toda vez que saca/tranfere
		cc.transfere(50, cp);
		
		//conta poupança não desconta nenhum valor ao sacar/transferir
		cp.transfere(10, cc);
		
		System.out.println("Saldo cc: " + cc.getSaldo());
		System.out.println("Saldo cp: " + cp.getSaldo());
		
		
	}
}
