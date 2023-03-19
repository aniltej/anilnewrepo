package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01_Way1_WebPushNotification_BrowserSetting {

	public static void main(String[] args) throws Exception{
		
		//When we launch the site "http://www.spicejet.com", a web notification will get poped out with "Allow" and "Block" Buttons
		//So if we do not want that to be poped out then use below like code 14th and 15th line
		//This we also called "Code Bypassing"
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(3000);
		
	}

}
