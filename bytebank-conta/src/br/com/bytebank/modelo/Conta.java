package br.com.bytebank.modelo;

public abstract class Conta implements Comparable<Conta> {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		
		if (agencia <= 0  || numero <= 0) {
			System.out.println("Conta n�o criada"); ;
		}else {
			this.agencia = agencia;
			this.numero = numero;
			Conta.total++;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Agencia: " + this.getAgencia() + " Numero: "+  this.getNumero() + " Saldo:" + this.saldo;
	}

	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		if(this.agencia != outraConta.agencia){
			return false;
		}
		if(this.numero != outraConta.numero){
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Conta o) {
		return Double.compare(this.saldo, o.saldo);
	}
}
