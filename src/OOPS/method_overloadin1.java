package OOPS;
// create payment processing system that accept payment in different mode
public class method_overloadin1 {
	void pay(int amount) {
		System.out.println("cash payment"+amount);
	}
	void pay(int amount,String UpiId) {
		System.out.println("Upi payment"+"of"+amount+"by"+UpiId);
	}
	void pay(int amount,String checknum,String bank) {
		System.out.println("Check payment"+"of"+amount+"by "+bank+"checknum is"+checknum);
	}
	void pay (String otp) {
		System.out.println("OTP number validate+otp");
	}
	
public static void main(String[] args) {
	method_overloadin1 m=new method_overloadin1();
	m.pay(100);
	m.pay(1000,"hitu@hdfc");
	m.pay(2000,"100002000","hdfc bankk");
	m.pay("1233");
	
	
	
}
}
