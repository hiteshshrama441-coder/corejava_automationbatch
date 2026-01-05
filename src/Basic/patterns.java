package Basic;

public class patterns {
public static void main(String[] args) { 
for	( int a=0; a<=5;a++) 
	{
		for(int b=0;b<=a;b++) {
		//	System.out.print(" *");
		}
		//System.out.println();
	}

// reverse loop
for(int i=5;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		//System.out.print("* ");
	}
	//System.out.println();
}

// A
// B C
char ch='A';
for(int i=1;i<=7;i++) {
	for(int j=1;j<=i;j++) {
		//System.out.print(ch+" ");
		ch++;
	}
	//System.out.println();
}
// pyramid patterns
for(int i=1;i<5;i++) {
	// spaces
	for(int j=i;j<5;j++) {
		//System.out.print(" ");
	}
	// pyramid stars
	for(int k=1;k<=(2*i-1);k++) {
	//	System.out.print("*");
	}
	//System.out.println();
}

//  print 1 to 50 even number
int i=2;
while(i<=50) {
	//System.out.println(i);
	i =i+2;
}
// print odd number
int k=1;
while(k<=50) {
	//System.out.println(k);
	k=k+2;
}
// pattern


for(int a=5;a>0;a--) {
	// spaces
	for(int b=a;b<5;b++) {
		System.out.print(" ");
		// pyramid stars
	}

	for(int g=1;g<=(2*a-1);g++) {
		System.out.print("*");
	}
	System.out.println();
}

for (int v=1255;v>=1;v--) {
	//System.out.println(v);
}
}
}

