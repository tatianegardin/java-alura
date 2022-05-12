package bytebank;

public class TestandoInterface {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		Cliente c = new Cliente();
		Diretor d = new Diretor();
		
		g.setSenha(2222);
		c.setSenha(1234);
		d.setSenha(112233);
		
		SistemaInterno autenticar = new SistemaInterno();
		autenticar.autenticar(c);
		autenticar.autenticar(d);
		autenticar.autenticar(g);
	}

}
