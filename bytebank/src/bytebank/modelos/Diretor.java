package bytebank.modelos;

public class Diretor extends Funcionario implements Autentica{
	private AutenticadorUtil autentica;
	
	public Diretor() {
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
	
	public double getBonificacao() {
		System.out.println("Rodou m�todo bonifica��o da classe Diretor");
		return super.getSalario() *2;
	}
}