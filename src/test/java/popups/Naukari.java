package popups;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukari {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.naukri.com/naukri-jobs");
		driver.manage().window().maximize();
	   WebElement data = driver.findElement(By.xpath("//div[.='Jobs']"));
        Thread.sleep(1000);
        
        Actions act=new Actions(driver);
        act.moveToElement(data).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[.='Jobs by skill']")).click();
        driver.findElement(By.xpath("//div[.='Services']")).click();
        Thread.sleep(1000);
        Set<String> windows = driver.getWindowHandles();
        for(String childwindow:windows)
        {
        	driver.switchTo().window(childwindow);
        	String title = driver.getTitle();
        	System.out.println(title);
        	Thread.sleep(1000);
        	if(title.contains("Resume Writing Services - CV - Bio data | Naukri Fastforward"))
        			{
        		break;
        			}
        }
        Thread.sleep(1000);
        Set<String> windows1 = driver.getWindowHandles();
        for(String childwindow1:windows1)
        {
        	driver.switchTo().window(childwindow1);
        	String title = driver.getTitle();
        	System.out.println(title);
        	Thread.sleep(1000);
        	if(title.contains("Browse Jobs by IT/Non-IT Skills - Naukri.com"))
        			{
        		break;
        			}
        }
        
	}

}
