package tests;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test02_Way2_WebPushNotification_ClickOn_Allow_Block_Buttons {

	public static void main(String[] args) throws Exception{
		
		Map<String,Object> hm = new HashMap<String,Object>();
		//1 --> To click on Allow Button, 2 --> To Click on Block Button
		hm.put("profile.default_content_setting_values.notifications", 1);
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("prefs", hm);
		Thread.sleep(2000);
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("http://www.spicejet.com");
		Thread.sleep(2000);
		
		

	}

}
