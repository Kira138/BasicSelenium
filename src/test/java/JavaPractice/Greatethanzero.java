package JavaPractice;

import java.util.Scanner;

public class Greatethanzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        if(a!=0)
        {
        	if(a>0)
        	{
        		System.out.println("1");
        	}
        	else
        	{
        		System.out.println("-1");	
        	}
        }
        else
        {
        	System.out.println("0");
        }
        
	}

}
