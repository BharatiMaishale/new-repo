package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentification {

	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		 //driver.get("http://the-internet.herokuapp.com/basic_auth");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("http:/admin:admin@/the-internet.herokuapp.com/basic_auth");
		
		

	}

}
