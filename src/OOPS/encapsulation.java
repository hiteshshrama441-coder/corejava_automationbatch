package OOPS;

public class encapsulation {
private int id,salary;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	if(salary>0) {
	this.salary = salary;
}
	else {
		System.out.println("Invalid amount");
	}
}
private String password,mobilenum;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobilenum() {
	return mobilenum;
}
public void setMobilenum(String mobilenum) {
	this.mobilenum = mobilenum;
}

}
