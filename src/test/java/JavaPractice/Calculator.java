package JavaPractice;

public class Calculator {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
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
