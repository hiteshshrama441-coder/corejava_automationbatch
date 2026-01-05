package OOPS;

public class Class_object {
	int a=10,b=7,res=0;  // global variable
	// how to create method
	//no parameter and no return type
	void add()
	{
		res=a+b;
		System.out.println("Addition is "+res);
	}
	void mul() {
		res=a*b;
		System.out.println("Multiplication is"+res);
	}
	void sub() {
		res=a-b;
		System.out.println("Subtraction is "+res);
	}  
	void div() {
		res=a/b;
		System.out.println("Division is "+res);
	}
public static void main(String[] args) 
{
	// make object of class
	Class_object co=new Class_object();
	// call method using object variable
	co.add();
	co.mul();
	co.sub();
	co.div();
}
}
