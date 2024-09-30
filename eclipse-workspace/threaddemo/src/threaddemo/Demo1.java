package threaddemo;

public class Demo1 {
public static void main(String[] args) {
	
//	Thread t1 = Thread.currentThread();
//	System.out.println(t1.getName());
//	System.out.println(t1.getPriority());
//	System.out.println(t1);
//	
//	t1.setName("Boran");
//	t1.setPriority(10);
//	System.out.println(t1);
	

	try {
		System.out.println("hello");
		Thread.sleep(1000);
		System.out.println("MANI");
		Thread.sleep(1000);
		System.out.println("KANTA");
		Thread.sleep(1000);
		System.out.println(" MG");
		Thread.sleep(1000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		
	}
	
}
}
