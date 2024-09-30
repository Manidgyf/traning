package com.probsol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {
	

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		//BAD METHOD
//		long mc = employeeList.stream().filter(g->g.getGender().startsWith("M")).count();
//		long fc = employeeList.stream().filter(g->g.getGender().startsWith("F")).count();
//		
//		System.out.println("FEMALE COUNT:   "+fc+"\n"+"MALE COUNT: "+mc);
		
		Map<String, Long> mf = StreamFunc.mfcount(employeeList);
		System.out.println(mf);
		System.out.println("-------------------------------------");
		//Unique
		employeeList.stream().map(s->s.getRole()).distinct().forEach(s->System.out.printf(s+" \n"));
		//avg age of male and female
		Map<String, Double> avgmf = employeeList.stream().collect(Collectors.groupingBy(s->s.getGender(),Collectors.averagingInt(s->s.getAge())));
		System.out.println(avgmf);
		//	Map<String, Long> mf = ls.stream().collect(Collectors.groupingBy(s->s.getGender(),Collectors.counting()));
		//highest paid emp
		Optional<Employee> highsal =employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(s->s.getSal())));
		System.out.println(highsal);
		System.out.println("---------------------------");
		//employees after 2015
		List<Employee> lst15 = employeeList.stream().filter(s->s.getYear()>2015).collect(Collectors.toList());
		System.out.println(lst15);
		System.out.println("---------------------------");
		
		//number in eac department
		
		Map<String,Long> avgdep = employeeList.stream().collect(Collectors.groupingBy(s->s.getRole(),Collectors.counting()));
		System.out.println(avgdep);
		System.out.println("---------------------------");
		
		//youngest male employ
		Optional<Employee> emp = employeeList.stream().filter(s->s.getGender()=="Male" && s.getRole()=="Product Development").min(Comparator.comparingInt(s->s.getYear()));
		System.out.println(emp);
		System.out.println("---------------------------\n");
		///most working experinece
		Optional<Employee> emp3 =employeeList.stream().sorted(Comparator.comparingInt(s->s.getYear())).findFirst();
		
				System.out.println(emp3);
				System.out.println("---------------------------\n");
		//male and female employees in marketing
		
		System.out.println(employeeList.stream().filter(s->s.getRole()=="Sales And Marketing").collect(Collectors.groupingBy(s->s.getGender(),Collectors.counting())));
		//avg salary of male and female employees
		
		Map<String,Double> mfavg2 = employeeList.stream().collect(Collectors.groupingBy(s->s.getGender(),Collectors.averagingDouble(s->s.getSal())));
		System.out.println(mfavg2);
		
		//employees in all departments
		
		// Map<String,List<Employee>> deps = employeeList.stream().collect(Collectors.groupingBy(s->s.getRole(),Collectors.toMap(s->s.getRole(),s)));
				
		//avg salary and total salary of whole organization
		
		// Map<Double,Double> m1  = employeeList.stream().collect(Collectors.averagingDouble(s->s.getSal()),Collectors.summingDouble(s->s.getSal()));
		
		
	}
	

}
