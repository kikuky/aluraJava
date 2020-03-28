
public class CalculadorDeImposto {

	private double TotalImposto;
	
	public void registra(Tributavel t){
		
		double Valor = t.getValorImposto();
		this.TotalImposto += Valor;
		
	}
	
	public double getTotalImposto() {
		
		return TotalImposto;
		
	}
	
}
