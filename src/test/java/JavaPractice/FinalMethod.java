package JavaPractice;

public class FinalMethod {
	
	public final void display() 
	{
	      System.out.println("This is a final method.");
	}
	}

	class Main extends FinalMethod {
	  // try to override final method
	  public final void display() {
	    System.out.println("The final method is overridden.");
	  }

	  public static void main(String[] args) {
	    Main obj = new Main();
	    obj.display();
	  }
	}