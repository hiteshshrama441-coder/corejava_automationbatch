package OOPS;

public class student_class {
private int rollNo,age;

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	if (age>=5 && age<=25) {
		this.age =age;
	}
	else {
		System.out.println("Invalid age! age should be between 5 to 25");
	}
}

}
