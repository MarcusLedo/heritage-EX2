package entities;

public class LegalPerson extends Person{
	private Integer employeeNumber;
	
	public LegalPerson(String name, Double anualIncome, Integer employeeNumber) {
		super(name, anualIncome);
		this.employeeNumber = employeeNumber;
	}
	
	public LegalPerson() {
		super();
	}

	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	
	@Override
	public Double calculateTax() {
		if(employeeNumber > 10) 
			return getAnualIncome() * 0.14;
		else
			return getAnualIncome() * 0.16;
	}
}
