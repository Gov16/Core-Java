
package info.java;
import java.util.*;
public class VariableDemo {
	
	int a=20;
	float b=21.2f;
	short s=33;
	long l=44;
	char c= 'A';
	boolean r=true;
	
	public static void main(String args[])

	{
		
		VariableDemo d1= new VariableDemo();
		
		
		System.out.println("Int Value:" + d1.a);
		System.out.println("Int Value:" + d1.b);
		System.out.println("Int Value:" + d1.s);
		System.out.println("Int Value:" + d1.l);
		System.out.println("Int Value:" + d1.c);
		System.out.println("Int Value:" + d1.r);


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println(num1/5);
		
		

		
	}

}

