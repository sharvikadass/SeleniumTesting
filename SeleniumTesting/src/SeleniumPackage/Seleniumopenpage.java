package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumopenpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		 ChromeDriver browserObject=new ChromeDriver();
		 browserObject.get("https://www.google.com/");
		 browserObject.findElement(By.name("q")).sendKeys("selenium python");
		browserObject.findElement(By.name("btnK")).submit();

	}

	
		
	}


