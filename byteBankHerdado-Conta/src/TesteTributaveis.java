
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.Deposita(100.0);
		
		SeguroDeVida Seguro = new SeguroDeVida();
		
		CalculadorDeImposto Calc = new CalculadorDeImposto();
		Calc.registra(cc);
		Calc.registra(Seguro);
		
		System.out.println(Calc.getTotalImposto());

	}

}
