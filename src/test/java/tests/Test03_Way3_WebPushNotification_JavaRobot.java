package tests;

import java.awt.Robot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test03_Way3_WebPushNotification_JavaRobot {

	public static void main(String[] args) throws Exception {
				
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Robot r = new Robot();
		
		//Manually when we checked, we have to click Tab for 2 times to move the focus on the "Allow" Button
		//Then we have click Tab for 1 time, to move the focus from "Allow" Button to "Block" Button
		
		//To press Tab Key for the first Time
		//For clicking on the Tab key, first we need to press the key and then release the key. So we have written like below
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(7000);
		
		//To Press Tab key for the 2nd Time
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(7000);
		
		//Now the focus is on the "Allow" Button, so click on the Enter Key if we want to accept the WebPush Notification
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

}
