package JavaPractice;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        String dayname = null;
        switch(a) {
        case 1:
        	dayname="Monday";
        	break;
        case 2:
        	dayname="Tuesday";
        	break;
        case 3:
        	dayname="Wednesday";
        	break;
        case 4:
        	dayname="Thursday";
        	break;
        case 5:
        	dayname="Friday";
        	break;
        case 6:
        	dayname="Saturday";
        	break;
        case 7:
        	dayname="Sunday";
        	break;
        }
        System.out.println("The day is: " + dayname);
	}

}
