package OOPS;
class admin{
	int id;
	public admin(int id) {
		System.out.println("parent class "+id);
	}
}
class child_class extends admin {
	public child_class(int id) {
	super(13);
	System.out.println("child class"+id);
	
	
}
}
public class single_level {
public static void main(String[] args) {
	child_class c=new child_class(12);
	
	
	
}
}
