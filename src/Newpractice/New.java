package Newpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class New {

	public static void main(String[] args) {
		//Webdriver driver=new EdgeDriver();    
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.foundit.in/");

		/* String key="webdriver.chrome.driver";
		  String Value="./chromedriver.exe";
		  System.setProperty(Key,Value);
		  WebDriver driver=new ChromeDriver();*/
		 
	}

}
