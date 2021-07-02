package entities;

public abstract class Person {
	private String name;
	private Double anualIncome;
	
	
	public Person(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public Person() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	@Override
	public String toString() {
		return name + " $" + String.format("%.2f", calculateTax());
	}
	
	public abstract Double calculateTax();
	
	
}
