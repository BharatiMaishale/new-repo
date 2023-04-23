package popups;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws Throwable {
	
			WebDriver driver=new EdgeDriver();
			FileInputStream fis= new FileInputStream("./commondata10.properties.txt");
			Properties pro=new Properties();
			pro.load(fis);
			
			String URL = pro.getProperty("url");
			driver.get(URL);
			  String USERNAME = pro.getProperty("username");
		      String PASSWORD = pro.getProperty("password");
		      driver.findElement(By.id("username")).sendKeys(USERNAME);
		      driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		      
			driver.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("name")).sendKeys("bharati");
            driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
            
            Alert alt=driver.switchTo().alert();
            alt.dismiss();
	}

}
