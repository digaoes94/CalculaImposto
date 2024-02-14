package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;
import entities.PersonPhysical;
import entities.PersonJuridical;

public class Program {
	//  System.out.println("");
	public static Scanner scan = new Scanner(System.in);
	public static List<Person> people = new ArrayList<>();

	public static void main(String[] args) {
		int quantPeople = 0;
		System.out.println("Calculadora de Imposto de Renda");
		System.out.println("Vamos calcular o imposto de quantas pessoas?");
		quantPeople = scan.nextInt();
		
		for (int a = 0; a < quantPeople; a++) {
			System.out.println();
			
			char personType;
			System.out.println("Esta pessoa é física ou jurídica (f/j)?");
			personType = scan.next().charAt(0);
			
			if (personType == 'f') {
				String name;
				double income, discounts;
				
				System.out.print("Informe o nome da pessoa: ");
				name = scan.next();
				System.out.print("Informe a renda da pessoa: ");
				income = scan.nextDouble();
				System.out.print("Informe gastos descontáveis da pessoa: ");
				discounts = scan.nextDouble();
				
				people.add(new PersonPhysical(name, income, discounts));
			}
			else {
				String name;
				double income, discounts;
				discounts = 0.0;
				int quantEmployees;
				
				System.out.print("Informe o nome da organização: ");
				name = scan.next();
				System.out.print("Informe o faturamento da organização: ");
				income = scan.nextDouble();
				System.out.print("Informe a quantidade de funcionários da organização: ");
				quantEmployees = scan.nextInt();
				
				people.add(new PersonJuridical(name, income, discounts, quantEmployees));
			}
		}
		
		for (Person person : people) {
			System.out.println("NOME: " + person.getName() + ". IMPOSTO: R$ " + String.format("%.2f", person.calculaImposto()) + ".");
		}
		
	}
}