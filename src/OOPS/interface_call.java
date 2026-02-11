package OOPS;

public class interface_call implements datadao {
	public void Email_send() {
		System.out.println("sending email");
	}
	public void  Attachment(int a) {
		System.out.println("sending attachment"+a);
	}
	public static void main(String[] args) {
		interface_call i=new interface_call();
		i.Email_send();
		i.Attachment(20);
	}
}
  