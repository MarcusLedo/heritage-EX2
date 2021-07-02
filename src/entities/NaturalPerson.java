package entities;

public class NaturalPerson extends Person{
	private Double healthExpenses;
	
	public NaturalPerson(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	public NaturalPerson() {
		super();
	}
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public Double calculateTax() {
		if(getAnualIncome() < 20000.0)
			return (getAnualIncome() * 0.15) - (healthExpenses * 0.5);
		else
			return (getAnualIncome() * 0.25) - (healthExpenses * 0.5);
	}
	
}
