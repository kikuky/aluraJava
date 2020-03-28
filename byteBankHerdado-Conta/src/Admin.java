public class Admin extends Funcionario implements Autenticavel {
	
	private Assinatura Ass;

	public Admin() {
		this.Ass = new Assinatura();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
