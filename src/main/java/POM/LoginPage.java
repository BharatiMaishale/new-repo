package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		
		//initialization
		 public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
 //declaration
		 @FindBy(id="username")
		 private WebElement UserTextField;
		 
		 @FindBy(name="pwd")
		 private WebElement PasswordTextField;
		 
		 @FindBy(id="loginButton")
		 private WebElement LoginButton;

		public WebElement getUserTextField() {
			return UserTextField;
		}

		public WebElement getPasswordTextField() {
			return PasswordTextField;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		}
		 
		 //Business logics
		public void login(String username,String password)
		{
			UserTextField.sendKeys(username);
			PasswordTextField.sendKeys(password);
			LoginButton.click();;
			
		}
	}


