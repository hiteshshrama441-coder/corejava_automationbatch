package OOPS;

public class call_employee {
public static void main(String[] args) {
	Employee_class em=new Employee_class();
	em.setEmpId(101);
	em.setSalary(31000);
	System.out.println(em.getEmpId()+" "+em.getSalary());
}
}
