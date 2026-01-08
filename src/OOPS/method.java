package OOPS;

public class method {
	void payment() {
		System.out.println("welcome to payment service");
	}
	void payment(int amount) {
		System.out.println("cashpayment successfully with : "+amount);
	}
	void payment(String upiID) {
		System.out.println("UPI payment successfully with : "+upiID);
	}
	void payment(int amount,String cardnum) {
		System.out.println("Card payment successfully with : "+amount+"card number is : "+cardnum);
	}
	void payment(String walletname,int amount) {
		System.out.println("Wallet payment successfully with : "+walletname+" amount is :"+amount);
	}
public static void main(String[] args) {
	method mo=new method();
	mo.payment();
	mo.payment(600);
	mo.payment("hitesh@123");
	mo.payment(5000, "1234-2525-1234-2252");
	mo.payment("phonepe wallet", 4550);
}
}
// area of sq,rect,and circle
//findvolume of cube,cuboid and cylinder
// 