package programa1;

public class Company extends TaxPayer{
	private int numberOfEmployees;

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	

	@Override
	public Double Tax() {
		if(numberOfEmployees <= 10) {
			return getAnualIncome()*16/100; 
		}
		else {
			return getAnualIncome()*14/100;
		}
	} 
	
	@Override
	public String toString() {
		return getName() + ":"+" " + "$" + Tax(); 
	}

	
}
