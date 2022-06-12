package bytebank.teste;

import bytebank.modelos.Diretor;
import bytebank.modelos.Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario tatiane = new Diretor();
		
		tatiane.setNome("Tatiane");
		tatiane.setCpf("1234654");
		tatiane.setSalario(1200);
		System.out.println(tatiane.getNome());
		System.out.println(tatiane.getBonificacao());
	}
}
