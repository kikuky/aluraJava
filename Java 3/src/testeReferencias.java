public class testeReferencias {

	public static void main(String[] args) {
		
		gerente g1 = new gerente();
		
		g1.setNome("Marcos");
		String nome = g1.getNome();
		g1.setSalario(5000.0);
		
		funcionario f = new funcionario();
		f.setSalario(2000.0);
		
		editorVideo ev = new editorVideo();
		f.setSalario(2500.0);
		
		controleBonificacao controle = new controleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		

		
	}
	
}
