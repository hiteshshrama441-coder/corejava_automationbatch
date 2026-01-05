package Basic;
// switchcase use to execute one block of code among multi
public class switchcase {
public static void main(String[] args) {
	int a=10,b=20;
	char op='*';
	switch(op)
	{
	case '+':
		System.out.println("Addition is "+(a+b));
		break;
	case'-':
		System.out.println("Subtraction is "+(a-b));
		break;
	case'*':
		System.out.println("Multiplication is "+(a*b));
		break;
	case'/':
		System.out.println("division is "+(a/b));
		break;
	default:
		System.out.println("Invalid operator");
  
	}
}
}
