package SeleniumPackage;//wait for some spefic element

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class Explicit_Wait {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
 // using chrome webdriver and specifying location of chromedriver on my machine to perform "Explicit Wait" in the chrome web browser
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
//  creat a new object browser object
 WebDriver browserObject = new ChromeDriver();
	       
 //  Explicit Wait and it will use WebDriverWait class .This class object is created the browserObject and time is intialized to the object
		// waiting for new element in the webpage
	      	WebDriverWait wait=newWebDriverWaitWait(browserObject,10);
	     
	     //  Open the web page https://www.google.com/
	      browserObject.get("http://google.com" );
	      //open another browser window
	     
	      WebElement gmailLink;
		//  Locate the gmail element and the wait  to the element.
	     gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
	     gmailLink.click();
	     //  close the browser
	   browserObject.quit();
	}

	private static WebDriverWait newWebDriverWaitWait(WebDriver browserObject, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
