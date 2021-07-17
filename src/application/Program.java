package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.People;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<People> fun = new ArrayList<>();
		
		System.out.println("Enter the number of tax players: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("individual or company:");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income:");
			double anualIncome = sc.nextDouble();
			
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				
				fun.add(new PessoaFisica(name, anualIncome, gastosSaude));
							
				
			}
			else {
				System.out.print("Number of employees: ");
				double numFuncionarios = sc.nextInt();
				
				fun.add(new PessoaJuridica(name, anualIncome, numFuncionarios));
			} 
		}
		
		System.out.println("TAXES PAID:");
		double sum = 0;
		for (People p : fun) {
			
			System.out.print(p.getName() +": $ "+  String.format("%.2f %n", p.calculoImposto()));
			sum += p.calculoImposto();
		}
		
		System.out.println("Total Taxes: $" + String.format("%.2f", sum));
		
		
		
		sc.close();
		
		
	}

}
