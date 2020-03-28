
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.Deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(123, 123);
		cp.Deposita(200.0);
				
		cc.Transfere(10.0, cp);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupan�a: " + cp.getSaldo());
	}

}
