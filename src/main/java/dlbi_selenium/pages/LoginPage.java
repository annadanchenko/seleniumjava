package dlbi_selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page{
	
	@FindBy(id="username")
	private WebElement usernameField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(name="submit")
	private WebElement submitButton;
	
	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	public void Login(){
		usernameField.sendKeys("admin");
		passwordField.sendKeys("admin");
		submitButton.click();
	}
		
	
}
