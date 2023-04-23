package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileuplaodPopups {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[contains(text(), ' Upload Resume')]  ")).click();
		WebElement data = driver.findElement(By.id("file-upload"));
	//	data.sendKeys("D:\\bharati\\Tech writing\.txt");
		System.out.println("uploaded successfully");
	}

}
