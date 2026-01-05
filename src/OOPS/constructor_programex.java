package OOPS;

public class constructor_programex {
	
	 constructor_programex() {
		// TODO Auto-generated constructor stub
		 
		 System.out.println("Welcome to Hdfc bank");
	}
	 
	 constructor_programex(String accountNumber,String accountHoldername ,double balance){
	System.out.println("Account Number: "+accountNumber);
	System.out.println("Account Holder Name: "+accountHoldername);
	System.out.println("Balance: "+balance);
}
        void displayAccountInfo() {
        	System.out.println("Account Information Displayed");
        }
	

	
	
	
public static void main(String[] args) {
	constructor_programex c=new constructor_programex();
	constructor_programex c1=new constructor_programex("130044556612" ,"hitesh",1001);
	c.displayAccountInfo();
} 
}
