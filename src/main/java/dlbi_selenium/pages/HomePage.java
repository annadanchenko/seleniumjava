package dlbi_selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

/**
 * Sample page
 */
public class HomePage extends Page {

	//private final String H1_TAG = "h1";
	
	//@FindBy(how = How.TAG_NAME, using = H1_TAG)
	//@CacheLookup
	//private WebElement h1Element;
	
	
	@FindBy(xpath = ".//*[@id='content']/section/nav/ul/li[1]/div/div/a")
	@CacheLookup
	private WebElement addButton;
	
	@FindBy(id = "results")	
	@CacheLookup
	private WebElement movieList;
	
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
		//PageFactory.initElements(webDriver, HomePage.class);
	}
	
	public void clickAddButton() {
		 addButton.click();
	}
	
	public boolean MovieExists(String movieTitle){
		if (isElementPresent(By.className("movie_cover")))
			{
				List <WebElement> movies = movieList.findElements(By.className("title"));
				for (WebElement movie : movies){
					if (movie.getText().contains(movieTitle)) return true;
				}				
			}
		 
		return false;
	}

}
