package tests;

import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test04_Way4_WebPushNotification_ClickOn_Allow_SikulixJar {

	public static void main(String[] args) throws Exception {
		
		//Using this approach, first we have to take Snippet of the element we want to automate  
		//and store in our project folder. Tkaen images are stored in src/test/resources/images folder
		//Then using Sikulix jar, we have to perform operations
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
		//Here we want to automate the WebPushNotification, I want to click on "Allow" Button
		Screen s = new Screen();
		
		//As I want to click on Allow Button in WebPushNotification, first I have taken Snippet of Allow Button and
		//Saved as "Allow.png". Now i am checking if an element exists with Allow.png. If exists click that 
		if(s.exists("src\\test\\resources\\images\\Allow.jpg", 5000) !=null)
		{
			s.click("src\\test\\resources\\images\\Allow.jpg"); //If exists clicking that
			
			
			//After clicking on the Allow Button for the 1st time, even if Notification is not closing, 
			//So in order to click the Allow Button till it gets closed, we have written like below
			while(true) 
			{
				try
				{
					s.click("src\\test\\resources\\images\\Allow.jpg");
				}
				catch(Exception ex)
				{
					System.out.println("Allow Button already clicked");
					break;
				}
			}
		}
	}

}
