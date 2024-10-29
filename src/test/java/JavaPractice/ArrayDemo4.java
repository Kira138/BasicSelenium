package JavaPractice;

import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter five integers:");

        int v1 = s.nextInt();
        int v2 = s.nextInt();
        int v3 = s.nextInt();
        int v4 = s.nextInt();
        int v5 = s.nextInt();

        int[] a = {v1, v2, v3, v4, v5};
        int sum = 0;

        System.out.println("The Array elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Print each element
            sum += a[i]; // Calculate sum
        }

        System.out.println("The sum of array elements is: " + sum);


	}

}
