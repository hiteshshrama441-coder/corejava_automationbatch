package OOPS;

public class constructor_program {
	
	constructor_program()
	{
		System.out.println("this is default constructor");
		// TODO Auto-generated constructor stub
	}
	
	constructor_program(int a)
	{
		System.out.println( a);
	}
	
	
	
public static void main(String[] args) {
	// calling constructor
	constructor_program cp=new constructor_program(); // object create and constructor call
	constructor_program cp1=new constructor_program(11);
}
}
