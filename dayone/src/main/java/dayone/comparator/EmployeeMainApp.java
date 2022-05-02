package dayone.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeMainApp {

	public static void main(String[] args) {
		Employee employee1 = new Employee(); //Using new keyword No-arg constructor method is invoked
		employee1.setEmpNo(1);
		employee1.setEmpName("Pavan");
		
		Employee employee2 = new Employee(5,"Hemanth");
		Employee employee3 = new Employee(4,"Ankita");
		Employee employee4 = new Employee(3,"Bob");
		Employee employee5 = new Employee(2,"Valdimir Putin");
		//Collection of employees. Employee objects are stored in an ArrayList
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		empList.add(employee5);
		//Unsorted empList
		System.out.println(empList);
		System.out.println("*************Using method reference*******************");
		empList.forEach(System.out::println);
		
		System.out.println("*************************Classic for loop***************");
		for(int index=0;index<empList.size();index++) {
			System.out.println(empList.get(index));
		}
		
		System.out.println("******************Advance for loop*********************");
		for(Employee emp : empList) { //for each emp in empList 
			System.out.println(emp); // print emp
		}
		
		System.out.println("******************Using iterator *********************");
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("******************Sort By Emp No *********************");
		Collections.sort(empList,new SortEmployeeByEmpNo());
		empList.forEach(System.out::println);
		//empList.sort(null);
		
		System.out.println("******************Sort By Emp Name *********************");
		Collections.sort(empList,new SortEmployeeByName());
		empList.forEach(System.out::println);
		System.out.println("******************Sort By Emp No in reverse order *********************");
		//Reverse the employee list on the basis of emp no 
		Collections.sort(empList,Collections.reverseOrder(new SortEmployeeByEmpNo()));
		empList.forEach(System.out::println);
	}

}
