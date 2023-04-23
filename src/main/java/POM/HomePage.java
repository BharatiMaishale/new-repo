package POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//a[text()='View Time-Track']")
	private WebElement viewLink;
	
	@FindBy(xpath="//a[text()='Enter Time-Track']")
	private WebElement enterLink;

	public WebElement getViewLink() {
		return viewLink;
	}

	public WebElement getEnterLink() {
		return enterLink;
	}
	
	public void clickViewLink()
	{
		viewLink.click();
	}
	public void clickEnterLink()
	{
		enterLink.click();
	}
	
}
