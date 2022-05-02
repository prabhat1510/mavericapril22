package dayone.comparator;
//Encapsulation-- OOPS principle 
public class Employee {
	//Attributes or Properties or Data Members of a class or an object
	private int empNo;
	private String empName;

	//No-arg constructor or default constructor
	public Employee() {
		
	}

	//Parameterized Constructor
	public Employee(int empNo, String empName) {

		this.empNo = empNo;
		this.empName = empName;
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}

	
}
