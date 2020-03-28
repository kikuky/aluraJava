
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
	
		Admin adm = new Admin();
		adm.setSenha(2222);
		
		Cliente Cliente = new Cliente();
		Cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.Autentica(g);
		si.Autentica(adm);
		si.Autentica(Cliente);
		
	}
	
}
