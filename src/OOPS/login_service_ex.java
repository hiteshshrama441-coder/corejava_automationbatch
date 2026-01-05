package OOPS;

public class login_service_ex {
	void login(String name,String pass) {
		System.out.println("enter the name and pass "+name+ "pass: "+pass);
	}
	void login(double mobile,String pass) {
		System.out.println("enter mobile number and pass "+mobile+ "pass: "+pass);
	}
	void login(String email,int pass) {
		System.out.println("enter email "+email+ "pass: "+pass);
	}
	
	
public static void main(String[] args) {
	login_service_ex ls=new login_service_ex();
	ls.login("hitesh","hitesh@123");
     ls.login(756828752,"sharma@22");
     ls.login("hiteshshar112@gmail.com",55555525);
}
}
