package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employer;

public class Program {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("How many employees will be registered? ");
		int n = read.nextInt();
		read.nextLine();
		List<Employer> listEmployer = new ArrayList<Employer>();
		
		
		
		for(int i = 0; i< n; i++) {
			System.out.println();
			Employer employer = new Employer();
			System.out.println("Employe #"+(i+1)+":");
			System.out.print("Id: ");
			employer.setId(read.nextInt());
			read.nextLine();
			System.out.print("Name: ");
			employer.setName(read.nextLine());
			System.out.print("Salary: ");
			employer.setSalary(read.nextDouble());
			listEmployer.add(employer);
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = read.nextInt();
		read.nextLine();
		Employer employer = listEmployer.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (employer == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = read.nextDouble();
			employer.increaseSalary(percentage);
		}
		
		 
		
		
		
		
		System.out.println();
		System.out.println("List of employees");
		for(Employer x:listEmployer){
		System.out.println(x.toString());
		}
		
		
		read.close();
	}

}
