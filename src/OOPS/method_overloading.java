package OOPS;
// method overloading
public class method_overloading {
	
	 void test() {
		 System.out.println("hitu");
	 }
	 void test(int a) { // local variable
		 System.out.println(a);
		
	 }
	 void test(int a,int b) {
		 System.out.println(a+ b);
	 }
	 void test(int id,String name) {
		 System.out.println(id+" "+name);
	 }
	
public static void main(String[] args) {
	method_overloading mo=new method_overloading();
	mo.test();
	mo.test(10);
	mo.test(1,2);
	mo.test(1,"test");
}
}
