package StringsPractice;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter A:");
	        String A=sc.next();
	        System.out.println("Enter B:");
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        String C=A+B;
	        int length = C.length();
	        System.out.println(length);
	        int result=A.compareTo(B);
	        if (result < 0) 
	        {
	            System.out.println("No");
	        } 
	        else if(result==0) 
	        {
	            System.out.println("Yes");	
	        }
	        else
	        {
	        	 System.out.println("Yes");
	        }
	        String D=A.substring(0, 1).toUpperCase()+A.substring(1);
	        String E=B.substring(0, 1).toUpperCase()+B.substring(1);
	        String result1 = D.concat(" ").concat(E);
	        System.out.println(result1);
	}
	        
}
//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
