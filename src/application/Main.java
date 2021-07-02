package application;
import java.util.Locale;
import java.util.Scanner;
import entities.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> entityList = new ArrayList<>();
		
		
		System.out.print("Entities quantity: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Person #" + (i + 1));
			System.out.print("-> Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("-> Anual Income: ");
			Double anualIncome = sc.nextDouble();
			System.out.print("Natural person or legal person? (n/l): ");
			Character resp = sc.next().charAt(0);
			resp = Character.toLowerCase(resp);
			
			if(resp == 'n') {
				System.out.print("-> Health Expenses: ");
				Double healthExpenses = sc.nextDouble();
				entityList.add(new NaturalPerson(name, anualIncome, healthExpenses));
			}else {
				System.out.print("-> Employee number: ");
				Integer employeeNumber = sc.nextInt();
				entityList.add(new LegalPerson(name, anualIncome, employeeNumber));
			}
			System.out.println();
		}
		
		Double totalTax = 0.0;
		System.out.println("TAXES PAID");
		for(Person x : entityList) {
			System.out.println(x);
			totalTax += x.calculateTax();
		}
		
		System.out.printf("\nTOTAL TAX = $%.2f", totalTax);
			
		
		
		sc.close();
	}

}
