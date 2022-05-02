package dayone.comparator;

import java.util.Comparator;

public class SortEmployeeByEmpNo implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpNo() - o2.getEmpNo();
	}

}
