package Basic;
//make nested switch case program
public class switchcase_program {
public static void main(String[] args) {
	int empId=102;
	String dept="CPP";
	int salary=33000;
	switch(empId)
	{
	case 101:
		System.out.println("Emp Name: John");
		break;
	case 102:
		System.out.println("Emp Name: Alice");
		switch(dept)
		{
		case "HR":
			System.out.println("Department:Human Resources");
			break;
		case "IT":
			System.out.println("Department: Information technology");
			break;
		case "CPP":
			System.out.println("Department: C++ Development");
			System.out.println("salary is:33000");
			break;
			default :
				System.out.println("Department: Unknown");
		}
		break;
	}
}
}
