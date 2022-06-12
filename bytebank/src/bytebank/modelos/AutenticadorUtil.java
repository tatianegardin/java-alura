package bytebank.modelos;

public class AutenticadorUtil {
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
}
