package entities;

public class PersonPhysical extends Person {

	public PersonPhysical(String name, double income, double discounts) {
		super(name, income, discounts);
	}
	
	@Override
	public double calculaImposto() {
		double imposto = 0;
		
		if (this.getIncome() >= 20000) {
			imposto = this.getIncome() * 0.25 - this.getDiscounts() * 0.5;
		}
		else {
			imposto = this.getIncome() * 0.15 - this.getDiscounts() * 0.5;
		}
		
		return imposto;
	}
}