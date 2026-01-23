package OOPS;
class parent_class{
	void test() {
		System.out.println("parent class method");
	}
	void test(int id) {
		System.out.println("parent class method "+id);
	}
}
class child_class extends parent_class {
	void test() {
		super.test();
		System.out.println("child class method");
	}
	void test(int id) {
		super.test(12);
		System.out.println(id);
	}
}

public class inheritance_method {
public static void main(String[] args) {
	child_class c=new child_class();
	c.test();
	c.test(13);
}
}
