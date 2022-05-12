package bytebank;

public class Diretor extends Funcionario implements Autentica{
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Rodou método bonificação da classe Diretor");
		return super.getSalario() *2;
	}
}