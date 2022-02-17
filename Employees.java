package project;

public abstract class Employees {
	protected String ID;
	protected String name ;
	protected double baseSalary;
	protected String employeeType;
	public Employees(String ID, String name, double baseSalary, String employeeType) {
		this.ID = ID;
		this.name = name;
		this.baseSalary = baseSalary;
		this.employeeType = employeeType;
	}

public String getID(){ 
	return ID;
	}
public void setID(String ID) {
	this.ID = ID;
	}
public String getname() {
	return name;
	}
public void setname(String name) {
	this.name = name;
	}
public double getbaseSalary() {
	return baseSalary;
	}	
public void setbaseSalary(double baseSalary) {
	this.baseSalary= baseSalary;
	}
public String getemployeeType() {
	return employeeType;
	
	}
public void setemployeeType(String employeeType) {
	this.employeeType = employeeType;		
	}
	abstract double getSalary();
}

  