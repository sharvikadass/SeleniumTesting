package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //importing Selenium class WebDriver
import org.openqa.selenium.chrome.ChromeDriver; //Importing ChromeDriver class

public class Selenium_Google_Search {

	public static void main(String[] args) throws InterruptedException 
		
		 {

			 // using chrome webdriver and specifying location of chromedriver on my machine
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// creating broweserObject. This object will be like WebDriver class
	WebDriver browserObject = new ChromeDriver();
	// 3. Open the web page www.google.com. Using get method of WebDriver class 
	browserObject.get("https://www.google.com/");
	browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
	// Locate the search button by name "btnk" and perform click
	 Thread.sleep(6000);
 browserObject.findElement(By.name("btnK")).submit();
						
	}

}
