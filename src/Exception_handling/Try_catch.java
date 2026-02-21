package Exception_handling;

public class Try_catch {
	void arthmetic_exception() {
			try 
			{
			int i=10,y=0;
			double div=i/y;
			System.out.println(div);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
				
			}
		void array_exception() {
			try {
				int arr[]=new int[3];
				arr[3]=34;
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			}
	void null_data() {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	

	
public static void main(String[] args) {
Try_catch t=new Try_catch();
t.array_exception();
t.null_data();

}
}


