package Basic;

public class revisonclass_object {
	// method has 4 types
	// no return no parameter
	void test() {
		// find factorial of 8
int fact =1;
		
		for (int i=1; i<=8; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of 8 is:" +fact);
	}
	void test1( ) {
		 int sum =0;
			for(int i=1; i<=30; i++){
				sum= sum+i;
			}
			System.out.println("sum of num 1 to 30 is: " + sum);
	}
	
	
public static void main(String[] args) {
	revisonclass_object ro=new revisonclass_object();
	ro.test();
	ro.test1();
}
}