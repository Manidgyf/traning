package bulliProject;

public abstract class Employee {
	
	int id;
	char catgeory;
	double wages;
	int years;
	int ncert;
	int hrs;
	String title;
	
	public Employee() {
		super();
	}


	public Employee(int id, double wages, int years) {
		super();
		this.id = id;
		this.wages = wages;
		this.years = years;
	}
	


	public abstract double calSal(Employee e);
	
	public abstract double mediClaim();
	
}
