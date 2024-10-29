package JavaPractice;

import java.util.Scanner;

public class FloatingPointNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        a = Math.round(a * 1000.0) / 1000.0;
        b = Math.round(b * 1000.0) / 1000.0;
        if(a==b)
        {
        	System.out.println("They are same");
        	}
        else
        {
        	System.out.println("They are different");	
        }
        
	}

}
