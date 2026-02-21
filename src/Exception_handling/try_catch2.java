package Exception_handling;




public class try_catch2 {
	
	void artihmetic() {
		try {
		int a=10,b=0;
	
		double c=a/b;
		System.out.println(c);
		
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	}
	
public static void main(String[] args) {
	
	try_catch2 ty=new try_catch2();
	ty.artihmetic();
	
}
}
