package StringsPractice;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter S:");
	        String S = in.next();
	   	 System.out.println("Enter Start:");
	        int start = in.nextInt();
	   	 System.out.println("Enter End:");
	        int end = in.nextInt();
	        String result=S.substring(start, end);
	        System.out.println(result);
	        
//https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true	        
	        
	}
}
