
public class testaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 226);
		//conta.numero = 1337;
		//conta.setNumero(1337);
		//System.out.println(conta.getNumero());
		
		Cliente Paulo = new Cliente();
		//conta.titular = paulo;
		conta.setTitular(Paulo);
		Paulo.setNome("Paulo Silveira");
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}
	
}