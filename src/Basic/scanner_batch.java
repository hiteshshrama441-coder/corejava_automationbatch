package Basic;

import java.util.Scanner;

//scanner class is used to take input from user
public class scanner_batch {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter first value");
	int a=scn.nextInt();
	System.out.println("enter second value");
	int b=scn.nextInt();
	System.out.println("Addition is "+(a+b)+"\n"+"multiplication is"+(a*b)+"\n"+"division is "+(a/b)+"\n"+"subtract is "+(a-b));
}
}

