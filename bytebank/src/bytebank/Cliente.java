package bytebank;

public class Cliente implements Autentica{
	private int senha;

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
