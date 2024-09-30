package bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddCustomer {
	
	void printCustomers(List<String> l1)
	{
		
		Iterator<String> itr = l1.iterator();
		System.out.println("elements are \n");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>() ;
		l1.add("chin");
		l1.add("tapak");
		l1.add("Dum");
		l1.add("Dumm..");
		AddCustomer a1 = new AddCustomer();
		a1.printCustomers(l1);
		
	}

}
