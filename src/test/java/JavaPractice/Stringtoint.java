package JavaPractice;

public class Stringtoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create string type variable
	    String data = "10";
	    System.out.println("The string value is: " + data);

	    // convert string variable to int
	    int num = Integer.parseInt(data);
	    System.out.println("The integer value is: " + num);
	    
	    String name = "Kiran";
	    boolean isMarried = true;
	    int age = 33;
	    
	    if (name.equals("Kiran") || !isMarried) {
	    	System.out.print("Excuted");
	    } else {
	    	System.out.print("Dont execute");
	    }
	    
	    
	}

}
