package Basic;

import java.util.Scanner;

public class user_defined {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("enter student id");
int id=scn.nextInt();
System.out.println("enter student name");
String name=scn.next();
System.out.println("enter student marks");
Double marks=scn.nextDouble();
System.out.println(id+"\n"+name+"\n"+marks);
}
}
