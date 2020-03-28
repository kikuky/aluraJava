
public class Assinatura {

	private int Senha;
	
	public void setSenha(int Senha) {
		
		this.Senha = Senha;
		
	}
	

	public boolean Autentica(int Senha)  {
		
		if (this.Senha == Senha) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}
