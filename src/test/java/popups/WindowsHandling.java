package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        driver.get("https://demo.automationtesting.in/Windows.html");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
      Set<String> windows = driver.getWindowHandles();
       for(String childwindows:windows)
       {
    	   driver.switchTo().window(childwindows);
    	   String title = driver.getTitle();
    	   System.out.println(title);
    	   
    	   if(title.contains("Selenium"))
    	   {
    		   break;
    	   }
       }
    	   driver.findElement(By.xpath("//a[.='Get Tickets']")).click();
    	   Set<String> windows1 = driver.getWindowHandles();
           for(String childwindows:windows1)
           {
        	   driver.switchTo().window(childwindows);
        	   String title = driver.getTitle();
        	   System.out.println(title);
        	   
        	   if(title.contains("Frames & windows"))
        	   {
        		   break;
        	   }
           }
    	       
             
	}

}
