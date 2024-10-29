package JavaPractice;
enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}
public class EnumSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level level = Level.MEDIUM;

	    switch(level) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	}

}
}
