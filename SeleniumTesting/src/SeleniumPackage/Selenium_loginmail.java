package SeleniumPackage;//This program will open redfinn.com and enter login credentials
//This is the name of the package 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;//This code import 'by' and 'chromedriver' class 

public class Selenium_loginmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //This program will open redfinn.com and enter login credentials
		  //This is the name of the package 
		 
		  
		 	//It setup property of chromedriver and locate the chrome drive
		  		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  		
		  		// Create a object named 'browserObject'
		  	        ChromeDriver browserObject = new ChromeDriver();
		  	        
		  		// Open the http://www.mail.rediff.com/ link using get method.
		  	        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  	        
		  	    
		  
		  		//It will locate sing in  icons name locator and perform click  enter
		  		 browserObject.findElement(By.name("proceed")).click();
		  		
		  		  
	}

}
