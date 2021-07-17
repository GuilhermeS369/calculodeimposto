package entities;

public class PessoaJuridica extends People{

	private Double numFuncionarios;
		
	public PessoaJuridica() {
		super();
		
	}
	public PessoaJuridica(String name, Double anualIncome, Double numFuncionarios) {
		super(name, anualIncome);
		this.numFuncionarios = numFuncionarios;
	}

	public Double getNumFuncionarios() {
		return numFuncionarios;
	}
	
	public void setNumFuncionarios(Double numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	
	@Override
	public double calculoImposto() {
		double sum = 0;
		if (getNumFuncionarios()<10) {
			
			sum = getAnualIncome() * 0.16; 
					}
		
		else {
			
			sum = getAnualIncome() * 0.14; 
			
		}
		return sum;
	
	}

}
