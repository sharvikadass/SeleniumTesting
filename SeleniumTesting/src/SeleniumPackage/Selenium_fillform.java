package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_fillform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserObject;
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		    browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		    
		    // sending text to the input box in the web form--------------
		    // 4. Locate Name section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("name")).sendKeys("sharvika");
		    browserObject.findElement(By.name("email")).sendKeys("sharvikasharvi@gmai.com");
		    browserObject.findElement(By.name("website")).sendKeys("amazon");
		    browserObject.findElement(By.name("comment")).sendKeys("This is good ");
		    browserObject.findElement(By.name("submit")).click();;
		    
	}

}
