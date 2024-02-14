package entities;

public class PersonJuridical extends Person {
	private int quantEmployees;
	
	public PersonJuridical(String name, double income, double discounts, int quantEmployees) {
		super(name, income, discounts);
		this.quantEmployees = quantEmployees;
	}
	
	//  get set quantEmployees
	public int getQuantEmployees() {
		return quantEmployees;
	}
	public void setQuantEmployees(int quantEmployees) {
		this.quantEmployees = quantEmployees;
	}
	
	@Override
	public double calculaImposto() {
		double imposto = 0;
		
		if (this.getQuantEmployees() > 10) {
			imposto = this.getIncome() * 0.14 - this.getDiscounts() * 0.5;
		}
		else {
			imposto = this.getIncome() * 0.16 - this.getDiscounts() * 0.5;
		}
		
		return imposto;
	}
}