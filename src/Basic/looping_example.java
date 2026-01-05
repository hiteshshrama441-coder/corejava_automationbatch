package Basic;

public class looping_example {
public static void main(String[] args) {
	// find factorial of a number
	//5!=5*4*3*2*1=120
	int fact=1;
	for(int i=1;i<=7;i++) {
		fact=fact*i;
	}
	System.out.println("Factorial of a number is:"+fact);
	//print table of number
	int num=3;
	for(int i=1;i<=10;i++) {
		System.out.println("multiplication of "+num+"*"+i+"="+(num*i));
	}
	//fibonacci series
	//1 2 3 5 8 13 21
	
	int a=1,b=2,sum;
	System.out.println(a+""+b);
	for(int i=1;i<=7;i++) {
		
		sum=a+b;
		System.out.println(sum+" ");
		a=b;
		b=sum;
	}
	//print odd and even numbers between 1 to 20
	for(int i=1;i<=20;i++) {
		if(i%2==0) {
			System.out.println("num is even"+i);
		}
		else {
			System.out.println("num is odd"+i);
		}
	}
}
}
//1+2+3+4+.......+n
//find factorial of a number using while loop
//find the maximum number using if else/nested if
