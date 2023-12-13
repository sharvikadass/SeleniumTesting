package SeleniumPackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class OpenCloseAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromeriver to open amazon page through chrome web browser.
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
				// 2. Initialize Webdriver object through ChromeDriver class. 
				WebDriver browserObject = new ChromeDriver();
				// 3. Open the http://www.amazon.com/ link using get method.
			        browserObject.get("http://www.amazon.com/");
				//close the browser
			        browserObject.close();

			

	}

}
