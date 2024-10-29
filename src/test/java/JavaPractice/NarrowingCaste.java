package JavaPractice;

//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte


public class NarrowingCaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	}

}
