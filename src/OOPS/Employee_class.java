package OOPS;

public class Employee_class {
private int empId,salary;

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	if(salary>0) {
	this.salary = salary;
}
	else {
		System.out.println("invalid amount");
	}

}
}
