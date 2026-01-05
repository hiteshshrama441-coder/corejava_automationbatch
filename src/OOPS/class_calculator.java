package OOPS;

public class class_calculator {
	
	// add two integers
	int add(int a,int b) {
		return a+b;
	}
	// add two doubles
	double add(double a,double b) {
		return a+b;
	}
	// add three integers 
	int add(int a, int b, int c) {
		return a+b+c;
	}
	

	
public static void main(String[] args) {
	// call
	class_calculator c=new class_calculator();
	System.out.println(c.add(5, 5));
	System.out.println(c.add(55, 55));
	System.out.println(c.add(1, 6, 6));
	
	
}
}
