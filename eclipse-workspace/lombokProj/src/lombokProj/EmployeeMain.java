package lombokProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
	
	Employee emp = new Employee(2, "MANI", 5);
	Employee e1 = new Employee(500,"Hraju",8);
	Employee e2 = new Employee(390,"Laila",25);
	
	HashSet<Employee> h1 = new HashSet<Employee>();
	
	h1.add(emp);
	h1.add(e1);
	h1.add(e1);
	
	System.out.println(h1);
	
	/*
	 * ArrayList<Employee> a1 = new ArrayList<Employee>();
	 * 
	 * a1.add(new Employee(67,"Hari", 45)); a1.add(emp); a1.add(e1);
	 * 
	 * 
	 * //Collections.sort(a1); Collections.sort(a1,new IdComparator());
	 * System.out.println(emp.getAge()); System.out.println(emp);
	 * 
	 * System.out.println(a1); System.out.println("\n");
	 * 
	 * for(Employee emp1: a1) { System.out.println(emp1);
	 * 
	 * }
	 */
	
	/*
	 * LinkedList<Employee> l1 = new LinkedList<Employee>(); l1.addFirst(e1);
	 * l1.addLast(e2); l1.addFirst(emp); System.out.println(l1); l1.removeFirst();
	 * System.out.println(l1); l1.removeLast(); System.out.println(l1);
	 */
	
	LinkedHashSet<Employee>t1 = new LinkedHashSet<Employee>();
	t1.add(e2);
	t1.add(e1);
	t1.add(emp);
	t1.add(e2);//duplicate value
	//Collections.sort(t1,new IdComparator());
	System.out.println("\n"+t1);
	
}
}
