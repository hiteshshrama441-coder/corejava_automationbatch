   package OOPS;

public class Class_object_1 {
	// no return and has parameter
	int a=10,b=20;
	int res=0;
	void test(int a,int b) {  // a,b is local variable
		res=a+b;
		System.out.println("Addition is "+res);
	}
	void mul (int a,int b) {
		res=a*b;
		System.out.println("Multiplication is"+res);
	}
	// method with return type and no parameter
	int sub() {
	res=a-b;
	return res;
	}
	// with parameter and with return type
	int div(int a,int b) {
		res=a/b;
		return res;
	
	}
	public static void main(String[] args) {
		Class_object_1 c=new Class_object_1();
		c.test(10, 20);
		c.mul(10, 20);
		System.out.println("Subtraction is"+c.sub());
		System.out.println("Division is "+c.div(10,20));
	}

}
