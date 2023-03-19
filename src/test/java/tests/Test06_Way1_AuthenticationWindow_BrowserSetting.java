package tests;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test06_Way1_AuthenticationWindow_BrowserSetting {

	public static void main(String[] args) throws Exception {
		
		//When we open "https://the-internet.herokuapp.com/basic_auth" url, a Authentication Window will be displayed before Login Screen
		//So we have do automation for that window
		//1st Way is Browser Setting. Using this way, that window will not be displayed
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//With this we will not get Authentication Window. But directly Username and Password
		//will be automatically filled in Authentication Window and next screen will be opened
		//here Username = admin and Password = admin, Credentials and URL is separated by "@"
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);

	}

}
