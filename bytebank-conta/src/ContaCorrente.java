
public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		valor += 0.2;
		return super.saca(valor);
	}

	@Override
	public double tributo() {
		return super.getSaldo() * 0.01;
	}
}
	
