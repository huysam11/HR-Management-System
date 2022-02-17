package project;

public class Contractor extends Employees {
	private double Bonus;
	public Contractor(String ID, String name, double baseSalary, String employeeType, double Bonus) {
		super(ID, name, baseSalary, employeeType);
		this.Bonus = Bonus;
	}
	public double getBonus() {
		return Bonus;
	}
	public void setBonus(double Bonus) {
		this.Bonus = Bonus;
	}
	@Override
	double getSalary() {
		return baseSalary + Bonus;
	}
}

