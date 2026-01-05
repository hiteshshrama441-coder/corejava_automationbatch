package Basic;
// conditional statement
//if-else statement
// if the condition is true,it will execute the if block
//else if condition
//nested if-else statement
//switch case statement
public class if_else {
public static void main(String[] args) {
	// check voting eligibility for age 18 and above 

	int age=3;
	if(age>=18)
	{
		System.out.println("you are eligible for voting!!");
	}
	else {
		System.out.println("you are not eligible for voiting!!");
				
	}


       //check number is even or odd
int num=101;
if(num%2==0) {
	System.out.println("num is even"+num);
}
else {
	System.out.println("num is odd"+num);
}
		//check num is positive,negative or zero
	int num1=-0;
	if(num1>0) {
		System.out.println("num is positive"+num1);
	}
	else if(num1<0) {
		System.out.println("num is negative"+num1);
	}
		else {
			System.out.println("num is zero"+num1);
		}
		
		//nested if-else statement
	//check student marks and grade
	//>90 <100=>A
	//70-90=>B
	//50-70->c
	//>50->fail
	int marks=-12;
	if(marks>=90 &&marks<=100) {
		System.out.println("Grade A");
	}
		else if(marks>=70 && marks<=90) {
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<=70) {
			System.out.println("Grade c");
	}
		else if(marks<=50 &&marks>=0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid marks");
		}
		
		
		
		
	}
		
	
}
