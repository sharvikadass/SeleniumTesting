package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_traininglogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		 
        ChromeDriver browserObject = new ChromeDriver();
	
        browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
       
	// browserObject.findElement(By.name("alert")).xpath("//*[@id=\"alert\"]");
	   
	 
	  //browserObject.findElement(By.name("")).xpath("");
		
	}

}
