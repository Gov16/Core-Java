package info.java;
import java.util.*;
public class ArrayDemo {

	int m;

	
//	CheckPassFail(int mark){
//	    m = mark;
//	}

	public void gradeCheck(int mark){
	if(mark >= 50){
	System.out.println("Pass");
	}
	else{
	System.out.println("Fail");
	}}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ar = new ArrayDemo();
		
		ar.gradeCheck(30);		
		

	}

}
