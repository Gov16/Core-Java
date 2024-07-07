package info.java;
import java.util.*;

public class Operators {
	
	static int  marks;
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		if( marks > 75) {
			
			System.out.println("Passed With First Class Distinction");
		}
		else if((marks > 60) && (marks < 75)){
		System.out.println("Passed With First Class");
			
		}
		
		else if((marks > 35) && (marks < 60)){
			
			System.out.println("Passed");
			
		}
		
		else if((marks < 35)){
			
			System.out.println("Failed");
			
		}
		
		
		
		
		
	}

}
