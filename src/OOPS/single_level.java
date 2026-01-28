package OOPS;
class admin{
	int id;
	public admin(int id) {
		System.out.println("parent class "+id);
	}
}
class kid_class extends admin {
	public kid_class(int id) {
	super(13);
	System.out.println("kid class "+id);
	
	}
}

public class single_level {
public static void main(String[] args) {
	kid_class k=new kid_class(12);

}

}

