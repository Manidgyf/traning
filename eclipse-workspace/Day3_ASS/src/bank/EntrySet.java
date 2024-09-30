package bank;

import java.util.HashSet;
import java.util.Set;

public class EntrySet {

	void printSet(Set<Integer> s)
	{
		if(s.isEmpty())
		{
			System.out.println("Your set is empty");
		}
		else
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		EntrySet es = new EntrySet();
		es.printSet(s1);
		
	}
}
