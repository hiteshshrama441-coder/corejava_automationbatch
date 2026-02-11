package OOPS;

public class call_student {
public static void main(String[] args) {
	student_class sc=new student_class();
	sc.setRollNo(111);
	sc.setAge(35);
	System.out.println("Student age: " + sc.getAge()+ "  "  + sc.getRollNo());
}
}
