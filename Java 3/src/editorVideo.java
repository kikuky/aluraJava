public class editorVideo extends funcionario {

	public double getBonificacao() {
		System.out.println("Chamando a bonificação do EDITOR DE VIDEO");
		return super.getBonificacao() + 100;
		
	}
	
}
