package SikuliEx;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
public class Sikuli {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Screen scr = new Screen();

		Pattern search = new Pattern("C:\\Users\\kiran\\Pictures\\ScreenShots\\Search6.png");

		scr.type(search, "NotePad");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern page = new Pattern("C:\\Users\\kiran\\Pictures\\ScreenShots\\Pageimg.png");
		scr.type(page, "Kiran");
		
	}

}