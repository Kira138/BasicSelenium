package JavaPractice;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
        //System.out.print("Input a: ");
        
        for(int i=1;i<=100;i++)
        {
        	
        	if(i%5==0 && i%3==0) {
        System.out.println("FizzBuzz");
        	
        	}

        	else if(i%3==0) {
        System.out.println("Fizz");
        }
       
        	else if(i%5==0) {
                System.out.println("Buzz");
                }
        	else {
        		System.out.println(i);
        	}
	}

}
}
