
public class TesteFuncionario {

	public static void main(String[] args) {
		
		//funcionario cliente = new Cliente();
				
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("222.222.222-22");
		nico.setSalario(3500.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
