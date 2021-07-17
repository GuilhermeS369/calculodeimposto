package entities;

public class PessoaFisica extends People{

	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double anualIncome, Double gastosSaude) {
		super(name, anualIncome);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculoImposto() {
		double sum = 0;
		if (getAnualIncome()<20000) {
			
			sum = getAnualIncome() * 0.15; 
			sum -= gastosSaude * 0.50;
		}
		
		else {
			
			sum = getAnualIncome() * 0.25; 
			sum -= gastosSaude * 0.50;
			
		}
		return sum;
	}

}
