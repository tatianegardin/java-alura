package bytebank.modelos;

public class ControleBonificacao {
	private int totalBonificacaoPaga ;
	
	public int getTotalBonificacaoPaga() {
		return totalBonificacaoPaga;
	}
	
	public void somaBonificacao(Funcionario funcionario) {
		this.totalBonificacaoPaga += funcionario.getBonificacao();
	}
}
