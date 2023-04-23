package Framework_maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;

public class Fileproperty {

	@Test
	public void fileproperty() throws Throwable
	 {
		
		WebDriver driver=new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//FileInputStream fis=new FileInputStream("C:\\Users\\2022\\Desktop\\commondata10.properties.txt");
		FileInputStream fis= new FileInputStream("./commondata10.properties.txt.txt");
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");;
	
		  String USERNAME = pro.getProperty("username");
	      String PASSWORD = pro.getProperty("password");
		
	  	driver.get(URL);
	  	LoginPage login=new LoginPage(driver);
	  	login.login(USERNAME, PASSWORD);
	  	
	  	HomePage home=new HomePage(driver);
	  	home.clickViewLink();
	      
	    //  driver.findElement(By.id("username")).sendKeys(USERNAME);
	   //   driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
	      

	}

}
