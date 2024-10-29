package JavaPractice;

import java.util.Scanner;

public class findpositiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();

        if (a>0)
        {
            System.out.println("Number is positive");
        }
        else if(a<0)
        {
        	System.out.println("Number is negative");	
        }
        else {
        	System.out.println("Number is zero");	
        }
	}

}
