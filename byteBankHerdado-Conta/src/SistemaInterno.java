public class SistemaInterno {

	private int Senha = 2222;
	
	public void Autentica (Autenticavel fa) {
		
		boolean Autenticou = fa.Autentica(this.Senha);
		if(Autenticou) {
			
			System.out.println("Pode entrar no sistema!");
			
		} else { 
			
			System.out.println("Não pode entrar no sistema");
		}
		
		
	}
	

	
}
