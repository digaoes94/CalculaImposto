package entities;

public abstract class Person {
	private String name;
	private double income, discounts;
	
	public Person(String name, double income, double discounts) {
		this.name = name;
		this.income = income;
		this.discounts = discounts;
	}

	//  get set name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//  get set income
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}

	//  get set discounts
	public double getDiscounts() {
		return discounts;
	}
	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}
	
	public abstract double calculaImposto();
	
}