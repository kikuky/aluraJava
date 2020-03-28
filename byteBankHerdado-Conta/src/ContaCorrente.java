
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int Agencia, int Numero) {
		
		super(Agencia, Numero);
		
	}
	
	@Override
	public boolean Saca(double Valor) {
		double ValorASacar = Valor + 0.2;
		return super.Saca(ValorASacar);
	}
	
	@Override
	public void Deposita(double Valor) {
		
	        super.Saldo += Valor; 
		
	}

	@Override
	public double getValorImposto() {
		return super.Saldo*0.01;
	}
}
