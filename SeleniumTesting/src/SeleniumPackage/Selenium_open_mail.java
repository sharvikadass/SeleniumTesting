//This program will open redfinn.com and enter login credentials
//This is the name of the package 
package SeleniumPackage;
import org.openqa.selenium.By;//This code import 'by' class  
import org.openqa.selenium.chrome.ChromeDriver;//this code import 'chromedriver' class 

public class Selenium_open_mail {//This is the name of the class /program

	
	public static void main(String[] args) {//this is the main of the program
		// TODO Auto-generated method stub
		 // it setup property of chromedrive and locate the chrome drive
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		 //creating broweserObject. This object will be link  ChromeDriver class
		//create a object name 'browser object'
        ChromeDriver browserObject = new ChromeDriver();
	//   Open the web page"https://mail.rediff.com/cgi-bin/login.cgi Using get method of Chromedriver class 
        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
       //it will find login box using locator and type the login character 
	 // browserObject.findElement(By.name("login")).sendKeys("sharvika");//Locate the name button and perform login 
	   
	  //it will find password box using locator and type the pasword character 
	  //browserObject.findElement(By.name("passwd")).sendKeys("sharvika_y1");//Locate the Password button and perform login 
	   
	  //It will locate sing in  icons name locator and perform click  enter
		 browserObject.findElement(By.name("proceed")).sendKeys("click");
	  
	  
	  
	  //4.Finding the webelement whose name is  proceed
	   browserObject.findElement(By.name("proceed")).click();
	    
	   // . Close the web browser.
		//browserObject.close();
		}
	        
	        
	        
	}

