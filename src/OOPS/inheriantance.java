package OOPS;
class parent {
	public parent () {
		System.out.println("parent class constructor");
	}
	// to do auto generated constructor stub
}
class child extends parent{
	public child( ) {
		System.out.println("child class constructor");
	}
}

public class inheriantance {
	
public static void main(String[] args) {
	child c=new child();
}
}
