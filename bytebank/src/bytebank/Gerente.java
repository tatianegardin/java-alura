package bytebank;

public class Gerente extends Funcionario implements Autentica{
	private int senha;
	

	public double getBonificacao() {
		System.out.println("Rodou m�todo bonifica��o da classe Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			return true;
		}else {
			return false;
		}
	}
	
}