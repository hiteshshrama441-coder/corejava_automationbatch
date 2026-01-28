package OOPS;
class School {
	public School() {
		System.out.println("Welcome to my school");
	}
}
class Student extends School {
	public Student() {
		System.out.println("Student class");
	}
}
class Admin_1 extends School {
	public Admin_1() {
		System.out.println("Admin class");
	}
}
class Principle extends School{
	public Principle() {
		System.out.println("Principle class");
	}
}
public class hierarchical_inheritance {
public static void main(String[] args) {
	Student st=new Student();
	Admin_1 ad=new Admin_1();
	Principle p=new Principle();
}
}
