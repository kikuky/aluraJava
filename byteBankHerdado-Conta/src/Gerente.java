public class Gerente extends Funcionario implements Autenticavel { //gerente � um funcionario
											//herda da class funcionario 
											//e assina o contrato autenticavel
											//implemente pode ser mais de um
											// extends nao
	private Assinatura Ass;
	
	public Gerente() {
		this.Ass = new Assinatura();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando a bonifica��o do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int Senha) {
		this.Ass.setSenha(Senha);
		
	}

	@Override
	public boolean Autentica(int Senha) {
		
		boolean Autenticou = this.Ass.Autentica(Senha);
		return Autenticou;
		
			}

		
	}