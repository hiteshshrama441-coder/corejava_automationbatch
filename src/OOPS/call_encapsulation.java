package OOPS;

public class call_encapsulation {
public static void main(String[] args) {
	encapsulation en=new encapsulation();
	en.setId(12);
	en.setMobilenum("75622251");
	en.setPassword("password");
	en.setSalary(12000);
	
	System.out.println(en.getId()+" "+en.getMobilenum()+" "+en.getPassword()+" "+en.getSalary());
}
}
