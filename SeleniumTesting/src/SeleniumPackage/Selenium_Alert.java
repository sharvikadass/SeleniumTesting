package SeleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Alert {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver browserObject = new ChromeDriver();
		
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
		// 4. Locate the alert button and perform click 
	        Thread.sleep(3000);
	        browserObject.findElement(By.id("Alert")).click();
	        
	        
		// 5. switch to alert box
	        Alert Alert = browserObject.switchTo().alert();
         // 6. getText method is used to get the text from alert box 
	        System.out.println(Alert.getText());
		// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method	
	        Thread.sleep(3000); // wait for 6000 mill seconds
		
		// 8. Switch the browserObject control to alert box and accept the alert using accept method 
	        Alert.accept(); //hit the OK button on the alert window
	        Thread.sleep(3000);
	        browserObject.close();
	}

}
