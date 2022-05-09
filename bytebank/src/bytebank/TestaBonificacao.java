package bytebank;

public class TestaBonificacao {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSalario(2000);
		
		Diretor d = new Diretor();
		d.setSalario(2000);
		
		EditorDeVideo e = new EditorDeVideo();
		e.setSalario(2000);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.somaBonificacao(f);
		controle.somaBonificacao(g);
		controle.somaBonificacao(d);
		controle.somaBonificacao(e);
		System.out.println(controle.getTotalBonificacaoPaga()); 
		
		
	}

}
