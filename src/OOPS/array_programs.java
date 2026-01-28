package OOPS;

import java.util.Scanner;

// array is used to store multiple values in a single variable
// array is a collection of similar type of data
// size of array is fixed
// array index starts from 0 to n-1
// array can be one dimensional or multi dimensional 
// array can be of primitive data type or object data type 
// array is created using 2 ways

public class array_programs {
	
	public array_programs() {
		int arr[]= {12,22,32,42,122,133,455};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// arr_var[for_loop var]
	}
	void display() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array are:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		}
	
public static void main(String[] args) {
	array_programs arr=new array_programs();
	arr.display();
}
}
