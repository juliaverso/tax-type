package programa1;

public class Individual extends TaxPayer {
	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures; 
	}

	@Override
	public Double Tax() {
		if(getAnualIncome() <= 20000) {
			return getAnualIncome()*15/100 - healthExpenditures*50/100; 
		}
		else {
			return getAnualIncome()*25/100 - healthExpenditures*50/100;
		}
	}

	@Override
	public String toString() {
		return getName() + ":"+" " + "$" + Tax(); 
	}
	
	
	
}
