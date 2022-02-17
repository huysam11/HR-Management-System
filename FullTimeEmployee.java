package project;

public class FullTimeEmployee extends Employees{
	 private double percent;
	 
	 public FullTimeEmployee(String ID, String name, double baseSalary, String employeeType, double percent) {
		 super (ID, name, baseSalary, employeeType);
		 this.percent = percent;
	}
	 
	public double getpercent() {
		return percent;
	}	
	public void setpercent(double percent) {
		this.percent = percent ;
	}
	@Override
	double getSalary(){
		return baseSalary + (baseSalary*percent/100);
	}
}
