package bulliProject;

public class ClassMain {

	public static void main(String[] args) {
		
		Employee e1 = new ProjectManager(101,10000,5);
		System.out.println(e1.calSal(e1)+" catgeory of employee is "+e1.catgeory+" Title is "+e1.title);
		
		Employee e2 = new TechnicalAssociate(102,50,2,2);
		System.out.println(e2.calSal(e2)+" catgeory of employee is "+e2.catgeory+" Title is "+e2.title);
		
		Employee e3 = new TechnicalAssociate(103, 500, 1, 2, 56);
		
		System.out.println(e3.calSal(e3)+" catgeory of employee is "+e3.catgeory+" Title is "+e3.title);
		
		System.out.println(e3.mediClaim());
	}
}
