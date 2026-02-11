package OOPS;
// abstraction means show feature of app and hide implementation detail\working
abstract class ab_test{
	abstract void Email_send();
	void Email_notification() {
		
	}
}
public class abstraction extends ab_test {
public static void main(String[] args) {
	
	
	abstraction ab=new abstraction();
	ab.Email_send();
}
void Email_send() {
	System.out.println("working detail of sms sending");
}
}
