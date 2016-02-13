package dlbi_selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMoviePage extends Page  {
	
	@FindBy(name = "name")
	//@CacheLookup
	private WebElement titleField;
	
	@FindBy(name = "year")
	//@CacheLookup
	private WebElement yearField;
	
	@FindBy(id = "submit")
	//@CacheLookup
	private WebElement saveButton;

	
	public AddMoviePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	public void addMovie(String Title, String movieYear) {
		titleField.sendKeys(Title);
		yearField.sendKeys(movieYear);
		saveButton.click();
	}
	
}
