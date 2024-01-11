package programa1;

import java.util.ArrayList;
import java.util.Scanner; 

public class Test {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <TaxPayer> payer = new ArrayList<>();  
	
		
		System.out.print("Enter the number of tax payers:"); 
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println("\nTax payer"+ " "+ "#" +i+" " +"data:");
			System.out.println("Individual or company (i/c)?");
			char item = sc.next().charAt(0);  
			
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Anual income:");
			double income = sc.nextDouble();
			
			  if (item == 'i') {
				  System.out.println("Health expenditures:");
				  double healthExpenditures = sc.nextDouble();
				  payer.add(new Individual(name, income, healthExpenditures));
			  }
			  else {
				  System.out.println("Number of employees:");
				  int numberOfEmployees = sc.nextInt();
				  payer.add(new Company(name, income, numberOfEmployees));
			  }
			
	
		}
		System.out.println("\n| TAXES PAID |"); 
		for(TaxPayer tax: payer) {
			System.out.println(tax.toString()); 
	}
		
		double amount = 0;
		for(TaxPayer tax: payer) {
			amount += tax.Tax(); 
	}
		System.out.print("\n| TOTAL TAXES |\n" + "$"+ amount);
		
		
		sc.close();
	}
		

}
