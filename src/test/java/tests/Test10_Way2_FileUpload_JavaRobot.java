package tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10_Way2_FileUpload_JavaRobot {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
		
		//First locate the "Choose File" Button.
		//As "Choose File" Button is in Frame, first switch the focus from Pagesource to Frame
		driver.switchTo().frame("iframeResult");
		Actions act = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//input[@type = 'file']"));
		Thread.sleep(6000);
		act.moveToElement(e).moveByOffset(-10, 0).click().build().perform();
		Thread.sleep(6000);
		
		//With above lines, we will be opening URL, and clicking the Choose File button on the page.
		//Once we click on the Choose File button then a File Upload Window will get Opened to choose files
		//So Automate like below using Java Robot
		
		//Automate File Upload window via KeyBoard Automation
		//Below 2 lines is for copying the location of the file from Code 
		StringSelection x = new StringSelection("C:\\Users\\pstra\\OneDrive\\Pictures\\Screenshots\\Hello.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		
		//Pasting the above copied location/path in "File name" box (When we want to browse any files, a Window will 
		//get opened to select the required files. So paste location/path in that window)
		Robot r = new Robot();
		
		//For Clicking (Pressing and then Releasing Ctrl + V) in "File name" Box
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		//So now we have to click Tab for 2 times to switch the focus to "Open" Button
		
		//Clicking the Tab Key for the 1st time
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		//Clicking the Tab Key for the 2nd time
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		//Now the focus is on "Open" Button in that Window. So click on that Open Button, then file will be selected
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		 

	}

}
