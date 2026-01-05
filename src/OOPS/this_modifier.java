package OOPS;

public class this_modifier {
	int a;
	void test(int a) {
	this.a=a;
	System.out.println(a);
	}
	void test1() {
		System.out.println(a);
	}
	
	
	
	
	
public static void main(String[] args) {
	this_modifier t=new this_modifier();
	t.test(10);t.test1();
}
}
// create constructor to invoke this method