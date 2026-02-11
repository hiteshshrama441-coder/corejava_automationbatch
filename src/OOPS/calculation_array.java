package OOPS;

public class calculation_array {
	public calculation_array() {
		int arr[]= {2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elements is:"+sum);
	}
	void maxnum() {
		int arr[]= {0,1,2,3,4,5,6,77};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maxinum number in array is: "+max);
	}
	void reverse_array() {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Array in reverse order:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	calculation_array c=new calculation_array();
	c.maxnum();
	c.reverse_array();
}
}
