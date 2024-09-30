package lombokProj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int age;
	
	  @Override 
	  public int compareTo(Employee o) 
	  { // TODO Auto-generated method
	   return this.id-o.id; }
	 

}
