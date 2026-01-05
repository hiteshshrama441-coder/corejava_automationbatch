package Basic;

public class examples_ {
public static void main(String[] args) {
	 int sum =0;
	for(int i=1; i<=30; i++){
		sum= sum+i;
	}
	System.out.println("sum of num 1 to 30 is: " + sum);
	
	//find factorial of any number
		int fact =1;
		
		for (int i=1; i<=8; i++) {
			fact=fact*i;
		}
		//System.out.println("Factorial of 8 is:" +fact);
	
		
		// using while loop
		int Sum =0;
		int i=1;
		
		
		while(i<=30) {
			Sum =Sum+i;
			i++;
		}
		// System.out.println("Sum of 1 to 30 is :" + Sum);
		
		// using while loop
		int factorial =1;
		int k=1;
		while(k<=8) {
			factorial =factorial*k;
			k++;
		}
		//System.out.println("factorial of 8 is:" +factorial);
			
		
}
}




