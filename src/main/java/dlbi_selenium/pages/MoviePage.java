package dlbi_selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviePage extends Page {
	
	@FindBy(xpath = ".//*[@id='movie']/div[2]/h2")
	//@CacheLookup
	private WebElement movieTitle;

	
	public MoviePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	public String getMovieTitle(){
		return movieTitle.getText();
	}
	

}
