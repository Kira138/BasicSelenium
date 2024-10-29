package JavaPractice;

public class Increment {

	public static void main(String[] args) {
		
		// num++ operations
		int num = 24;
		System.out.println(num++);
		System.out.println(num);
		
		num = num + 1;
		System.out.println(num);
		
		num += 1;
		System.out.println(num);
		
		// ++num operations. Number should be 27 before running below
		System.out.println(++num);
	}
}
