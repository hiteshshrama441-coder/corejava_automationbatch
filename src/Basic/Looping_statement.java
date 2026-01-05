package Basic;
//looping statement use to execute block of code  multiple times
//types of looping statement
//for loop
//while loop
//do while loop
//enhanced for loop(foreach loop)
public class Looping_statement {
public static void main(String[] args) {
	// print 1 to 10 numbers using for loop
for(int i=0;i<=10;i++)
{
	System.out.println(i);
}
// make decremental for loop
for(int i=10;i>=1;i--)
{
	System.out.println(i);
	}
// print 1 to 10 numbers using while loop
int j=0;
while(j<=10) {
	System.out.println(j);
	j++;
	
}
//print 1 to 10 numbers using do while loop
//execute block of code at least one time
int k=15;
do {
	System.out.println("do while:"+k);
	k++;
	
}
while(k<=10);
}
}
