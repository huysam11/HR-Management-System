package project;

import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeList {
	ArrayList<Employees> list = new ArrayList<>();
	
	public void input() {
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter ID: ");
			String ID = scanner.nextLine();
			if (ID.equals("") || ID == null){
				break;
			}
			System.out.print("Enter name: ");
			String name = scanner.nextLine();
			System.out.print("Enter Salary: ");
			double baseSalary = Double.parseDouble(scanner.nextLine());
			System.out.print("Enter employeeType (fulltime/contract): "); 
			String employeeType = scanner.nextLine();
			if (employeeType.equalsIgnoreCase("fulltime")) {
				System.out.print("Enter percent: " );
				double percent = scanner.nextDouble();
				Employees NewEmployee = new FullTimeEmployee(ID, name, baseSalary, employeeType , percent);
				list.add(NewEmployee);
			}else if(employeeType.equalsIgnoreCase("contract")) {
				System.out.print("Enter Bonus: ");
				double Bonus = scanner.nextDouble();
				Employees NewEmployee = new Contractor(ID, name, baseSalary, employeeType , Bonus);
				list.add(NewEmployee);
			}else {
				System.out.println("Please re-enter your information!");
			}			
		}while (true);
	}
	public void output () {
		for (Employees nv: list) {
			System.out.printf("ID: %s | Name: %s | EmployeeType: %s | newSalary: %.2f\n", nv.getID(), nv.getname(), nv.getemployeeType(), nv.getSalary());
		}
	}
	public void find() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee's ID: ");
		String ID = sc.nextLine();
		Boolean check = false;
		for (Employees n : list) {
			if (ID.equalsIgnoreCase(n.getID()));{
				System.out.printf("ID: %s| Name: %s| EmployeeType:%s| newSalary:%.2f\n", n.getID(), n.getname(), n.getemployeeType(),n.getSalary());
				check =true;
				break;
			}
		}
	
	if (check == false) {
		System.out.println("This employee is not exist !");
	}
}
	
	public void delete() {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter ID to remove: ");
	        String ID = sc.nextLine();
	        Boolean check = false;
	        for (Employees n : list) {
	            if (ID.equalsIgnoreCase(n.getID())) {
	                list.remove(n);
	                check = true;
	                break;
	            }
	        }
	        if (check == false) {
	            System.out.println("This employee is not exist");
	        }else {
	            System.out.println("This ID is deleted !");
	        }
	    }	
	
	public void menu() {
		Scanner s = new Scanner(System.in);
		int select = 0 ;
		do {
			System.out.println("\n Menu");
			System.out.println("1. Enter employees's information");
			System.out.println("2. All Employees's information");
			System.out.println("3. Find employee by ID");
			System.out.println("4. Remove employee");
			System.out.println("0. Quit");
			System.out.println("Enter your selection:");
		
			select = s.nextInt();
			if (select !=0) {
				switch (select) {
					case 0:
						break;
					case 1:
						input();
						break;
					case 2:
						output();
						break;
					case 3:
						find();
						break;
					case 4:
						delete();
						break;
					default:
						System.out.println("Wrong information, Please Enter Again !");
				}
			}
		}while (select !=0);
	}
}
