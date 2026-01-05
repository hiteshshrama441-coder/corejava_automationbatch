package OOPS;

public class this_methodex {
	
	int a;
	
	this_methodex(int a)  {
		this.a=a;
		this.test();
	}
	void test() {
		System.out.println(a);
	}
	
	
	
	
	
public static void main(String[] args) {
	this_methodex t=new this_methodex(10);
}
}
