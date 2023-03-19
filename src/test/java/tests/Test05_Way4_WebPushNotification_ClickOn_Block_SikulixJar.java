package tests;

import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test05_Way4_WebPushNotification_ClickOn_Block_SikulixJar {

	public static void main(String[] args) throws Exception {
		
		//Using this approach, first we have to take Snippet of the element we want to automate  
		//and store in our project folder. Tkaen images are stored in src/test/resources/images folder
		//Then using Sikulix jar, we have to perform operations
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
		//Here we want to automate the WebPushNotification, I want to click on "Allow" Button
		Screen s = new Screen();
		
		//As I want to click on Block Button in WebPushNotification, first I have taken Snippet of Block Button and
		//Saved as "Block.jpg". Now i am checking if an element exists with Block.jpg. If exists click that 
		if(s.exists("src\\test\\resources\\images\\Block.jpg", 5000) !=null)
		{
			s.click("src\\test\\resources\\images\\Block.jpg"); //If exists clicking that
			
			
			//After clicking on the Block Button for the 1st time, even if Notification is not closing, 
			//So in order to click the Block Button till it gets closed, we have written like below
			while(true) 
			{
				try
				{
					s.click("src\\test\\resources\\images\\Block.jpg");
				}
				catch(Exception ex)
				{
					System.out.println("Block Button already clicked");
					break;
				}
			}
		}
	}

}
