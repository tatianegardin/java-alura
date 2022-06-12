package bytebank;

public class Cliente implements Autentica{
	private AutenticadorUtil autentica;
	
	public Cliente() {
		this.autentica = new AutenticadorUtil(); 
	}
	
	@Override
	public void setSenha(int senha) {
		autentica.setSenha(senha);
		
	}
	
	@Override
	public boolean autentica(int senha) {
		return autentica.autentica(senha);
	}
}
