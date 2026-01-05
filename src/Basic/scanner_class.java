package Basic;

import java.util.Scanner;

//scanner class is used to take input from user
public class scanner_class {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter integer value");
	int a=scn.nextInt();
	System.out.println("enter name");
	String s=scn.next();
	System.out.println("enter double val");
	double d=scn.nextDouble();
	System.out.println(a+"\n"+s+"\n"+d);
}
}
