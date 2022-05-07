package bytebank;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario tatiane = new Funcionario();
		
		tatiane.setNome("Tatiane");
		tatiane.setCpf("1234654");
		tatiane.setSalario(1200);
		System.out.println(tatiane.getNome());
		System.out.println(tatiane.getBonificacao());
	}
}
