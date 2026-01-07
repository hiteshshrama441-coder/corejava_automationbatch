package OOPS;
// polymorphism is defines as one method name with different forms
//2 types of polymorphism 
// compile time polymorphism (method overloading)
// run time polymorphism (method overriding)

// method overloading is same class and same method but different parameters
public class polymorphism {
	void add() {
		System.out.println("no parameter method");
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(String str) {
		System.out.println(str);
	}
	
public static void main(String[] args) {
	polymorphism po=new polymorphism();
	po.add();
	po.add(5);
	po.add(5, 6);
	po.add("mom");
}
}
