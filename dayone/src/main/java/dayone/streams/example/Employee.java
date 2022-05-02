package dayone.streams.example;

import java.util.Optional;

/**
 * @author UD SYSTEMS
 *
 */
public class Employee {
	
	private Integer empId;
	private String empName;
	//Aggregation
	//HAS-A relationship 
	private Department department;
	private Double salary;
	private Integer age;
	private String jobTitle;
	

	public Employee(Integer empId, String empName, Department department, Double salary, Integer age, String jobTitle) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.jobTitle = jobTitle;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}


}
