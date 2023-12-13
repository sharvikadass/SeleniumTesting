package testngPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class TestNg_before_after {
	WebDriver browserObject;
	
	 @BeforeTest
	 public void before() throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
   browserObject = new ChromeDriver();
		  
			  }
	 
	 @AfterTest
	  public void after() throws InterruptedException {
		 
		browserObject.close();
		    }
	 
	 
	 @Test
	  public void Open_and_Close_AmazonSite() throws InterruptedException {
		
      browserObject.get("http://www.amazon.com/");
		        }
	
	@Test
	  public void Open_and_Close_CNBC_Site() throws InterruptedException {
		  
		        
		        browserObject.get("http://www.cnbc.com/");
			 
		            
		   }
	
	@Test
	  public void Open_and_Close_Yaho_Site() throws InterruptedException {
		  
		  
		       
		       
		        browserObject.get("http://www.yahoo.com/");
			 
			
		            
		   }
	
	
	
	
	
}