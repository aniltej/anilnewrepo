package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test09_Way1_FileUpload_BrowserSetting {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
		
		//First locate the "Choose File" Button.
		//As "Choose File" Button is in Frame, first switch the focus from Pagesource to Frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@type = 'file']")).sendKeys("C:\\Users\\pstra\\OneDrive\\Pictures\\Screenshots\\Hello.png");
		

	}

}
