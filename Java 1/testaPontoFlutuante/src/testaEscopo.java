
public class testaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando condicionais 2");
		int idade = 19;
		int quantidadePessoas = 1;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2){
			
			acompanhado = true;
			
		} else {
			
			acompanhado = false;
			
		}

		if (idade >= 18 && acompanhado) {

			System.out.println("Pode entrar!");

		} else {
				
				System.out.println("N�o pode entrar!");
			
			}
			
		}  

	}


