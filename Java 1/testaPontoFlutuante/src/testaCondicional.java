
public class testaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 2;

		if (idade >= 18) {

			System.out.println("Maior de idade, pode entrar!");

		} else {
			
			if (quantidadePessoas >= 2) {
				
				System.out.println("Voc� pode entrar, pois est� acompanhado!");
				
			} else {
				
				System.out.println("Menor de idade, n�o pode entrar!");
			
			}
			
		}  

	}

}
