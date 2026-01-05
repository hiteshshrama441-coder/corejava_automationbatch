package OOPS;

public class area_calculator {
	
int areacalculator(int side) { // area of square
	return side * side;
}
	int areacalculator(int length, int width) {// area of rectangle
	return length * width;
	}
	double areacalculator(double radius ) { // area of circle
		return 3.14 * radius * radius;
	}
	
	
	
public static void main(String[] args) {
	area_calculator ac=new area_calculator();
	System.out.println(ac.areacalculator(5));
	System.out.println(ac.areacalculator(3, 6));
	System.out.println(ac.areacalculator(3.0));
	
}
}
