package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CalenderEx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
				// driver.findElement(By.xpath("//div[text()='March 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='21']")).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//span[text()='Return']")).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//div[text()='March']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='26'][2]")).click();*/
	}

}
