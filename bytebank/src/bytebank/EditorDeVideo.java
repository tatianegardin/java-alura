package bytebank;

public class EditorDeVideo extends Funcionario{
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
		System.out.println("Rodou m�todo bonifica��o da classe Editor de Video");
		return 200;
	}
}