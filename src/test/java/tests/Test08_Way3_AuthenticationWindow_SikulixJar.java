package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test08_Way3_AuthenticationWindow_SikulixJar {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Screen s = new Screen();
		
		//Now to fill Username Textbox in Authentication Tab using Sikulix, we have to first take Username Textbox Snippet
		//I have taken snippet of Username textbox and given name as Username.jpg and typing as "admin" in that textbox
		//like below
		s.type("src\\test\\resources\\images\\Username.jpg", "admin");
		
		//Similary I am now automating Password textbox by filing in that textbox
		//So first take Snippet of that Password Textbox element and then fill like below
		s.type("src\\test\\resources\\images\\Password.jpg", "admin");
		
		//Now automate SignIn Button. As usual take Snippet of SignIn Button and save and click on that button
		s.click("src\\test\\resources\\images\\SignIn.jpg");
		
		
		
		
		

	}

}
