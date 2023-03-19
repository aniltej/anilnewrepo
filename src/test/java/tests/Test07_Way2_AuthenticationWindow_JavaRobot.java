package tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test07_Way2_AuthenticationWindow_JavaRobot {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		
		//For automating Username Textbox(Filling Username) in Authentication Window
		
		//Below 2 lines are for copying the "admin" from EclipseIDE
		StringSelection x = new StringSelection("admin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		
		Robot r =  new Robot();
		
		//For Pasting Username (admin) in Username textbox in Authentication Window
		r.keyPress(KeyEvent.VK_CONTROL); //Pressing Ctrl Key in Keyboard
		r.keyPress(KeyEvent.VK_V); //Pressing V key in Keyboard
		r.keyRelease(KeyEvent.VK_V); //Releasing V key in Keyboard
		r.keyRelease(KeyEvent.VK_CONTROL); //Releasing  Ctrl key in Keyboard
		Thread.sleep(3000);
		
		//Clicking the Tab Key so that now focus goes to Password textbox in Authentication Window
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		
		//For automating Password Textbox(Filling Password) in Authentication Window
		
		//Below 2 lines are for copying the "admin" from EclipseIDE
		StringSelection y = new StringSelection("admin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
		
		//For Pasting Password (admin) in Password textbox in Authentication Window
		r.keyPress(KeyEvent.VK_CONTROL); //Pressing Ctrl Key in Keyboard
		r.keyPress(KeyEvent.VK_V); //Pressing V key in Keyboard
		r.keyRelease(KeyEvent.VK_V); //Releasing V key in Keyboard
		r.keyRelease(KeyEvent.VK_CONTROL); //Releasing  Ctrl key in Keyboard
		Thread.sleep(3000);
		
		//Clicking the Tab Key so that now focus goes to SignIn Button in Authentication Window and Clicking Enter on
		//SignIn Button 
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
