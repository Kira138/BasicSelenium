package JavaPractice;

import java.util.Scanner;

public class Calculatorinputvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
		
        System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);

			}
			public int sum(int a, int b) {
			return a+b;
			
		}
			public int Subtraction(int a, int b) {
				return b-a;
			}
			public int Multiplication(int a, int b) {
				return a*b;
			}
			public int Division(int a, int b) {
				return b/a;
			}	
			public int Modulus(int a, int b) {
				return b%a;
			}
		}

