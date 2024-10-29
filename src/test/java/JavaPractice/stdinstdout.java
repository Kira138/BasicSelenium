package JavaPractice;

import java.util.Scanner;

public class stdinstdout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();  //i=42
        double d = scan.nextDouble();  //d=3.141
         scan.nextLine(); 
        String s = scan.nextLine(); //s=Welcome to HackerRank's Java tutorials! //// This will capture the entire line, including spaces

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}