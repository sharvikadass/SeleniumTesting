package SeleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_prompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver browserObject = new ChromeDriver();
		
		//  Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
		
	        browserObject.findElement(By.id("prompt")).click();
	        Alert alert2 = browserObject.switchTo().alert();
	        System.out.println(alert2.getText());
	        Thread.sleep(6000);
		
	        alert2.sendKeys("sharvika");
		
	        alert2.accept();
		
		// Close the web browser
		browserObject.close(); 
	        
	        
	      }

}
