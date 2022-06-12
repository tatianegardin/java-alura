package bytebank.teste;

import bytebank.modelos.Gerente;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente tatianeGerente = new Gerente();
		
		tatianeGerente.setNome("Tatiane Lacerda Gardin");
		System.out.println(tatianeGerente.getNome());
		
		tatianeGerente.setSalario(5500.00);
		System.out.println(tatianeGerente.getSalario());
		
		tatianeGerente.setSenha(1234);
		boolean podeAcessar = tatianeGerente.autentica(1234);
		System.out.println("Acesso permitido? " + podeAcessar);
		
		System.out.println(tatianeGerente.getBonificacao());
		
	}
}
