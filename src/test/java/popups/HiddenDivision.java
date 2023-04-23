package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB, "manager", Keys.ENTER);
		
		Thread.sleep(1000);
        driver.findElement(By.xpath("//div[.='Tasks']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='checkbox inactive']/div[@class='img'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='delete button']")).click();
	}

}
