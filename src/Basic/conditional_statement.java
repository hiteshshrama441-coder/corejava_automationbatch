package Basic;

public class conditional_statement {
public static void main(String[] args) {
	//check number is negative or positive
	int num=-11;
	if(num>0) {
		//System.out.println("num is positive num"+num);
	}
	else {
	//	System.out.println("num is negative num"+num);
	}
	// check num is even or odd
	int n=11;
	if(n%2==0) {
	//	System.out.println("num is even num"+n);
	}
	else {
		//System.out.println("num is odd num"+n);
	}
	
	//find largest number among 3 numbers
	int a=45;
	int b=51;
	int c=100;
	if(a>=b && a>=c) {
		//System.out.println("a is the largest num"+a);
	}
	else if(b>=a && b>=c) {
		//System.out.println("b is the largest num"+b);
	}
	else {
		//System.out.println("c is the largest num"+c);
	}
	int y=10,z=30;
	char ch='*';
	switch (ch) {
	case '+':
		System.out.println("Addition is"+(y+z));
		break;
	case '-':
		System.out.println("Subtraction is"+(y-z));
		break;
	case'/':
		double v=y/z;
	System.out.println("Division is "+v);
	break;
	case'*':
	System.out.println("Multiplication is "+(y*z));
	break;
	
	default:
		System.out.println("Invalid operator");
		break;
	}
	// 
	
}
}
