
public class testeFuncionario {

	public static void main(String[] args) {
		
		funcionario nico = new funcionario();
		nico.setNome("Nico Aodskaa");
		nico.setCpf("222.222.222-22");
		nico.setSalario(3500.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}