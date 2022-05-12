package bytebank;

public class Gerente extends Funcionario implements Autentica{
	private AutenticadorUtil autentica;
	
	public Gerente() {
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
		System.out.println("Rodou método bonificação da classe Gerente");
		return super.getSalario();
	}
	
}