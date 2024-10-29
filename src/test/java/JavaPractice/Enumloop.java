package JavaPractice;
enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}
public class Enumloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (Level myVar : Level.values()) {
		      System.out.println(myVar);
		    }
	}
}
