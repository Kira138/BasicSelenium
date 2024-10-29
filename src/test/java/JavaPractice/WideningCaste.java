package JavaPractice;

public class WideningCaste {

	//Widening Casting (automatically) - converting a smaller type to a larger type size
	//byte -> short -> char -> int -> long -> float -> double
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	}

}
