package byteBank;

public class testaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.saca(200);
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}
	
}
