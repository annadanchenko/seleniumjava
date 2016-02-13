package dlbi_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dlbi_selenium.pages.HomePage;
import dlbi_selenium.pages.LoginPage;
import dlbi_selenium.pages.MoviePage;
import dlbi_selenium.pages.AddMoviePage;

public class HomePageTest extends TestBase {

	HomePage homepage;
	
	//@Parameters({ "path" })
	@BeforeClass
	public void testInit() {

		// Load the page in the browser
		driver.get(baseUrl + "/php4dvd/");
		//homepage = new HomePage(driver);
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void addMovieTest() throws InterruptedException {
			
			driver.get(baseUrl + "/php4dvd/");
			
			LoginPage loginPage = new LoginPage(driver);
			loginPage.Login();
		
			homepage.clickAddButton();		    
		    
		    AddMoviePage moviePage = new AddMoviePage(driver);
		    String movieTitle = "title "+ java.util.UUID.randomUUID().toString();
		    String movieYear = "2000";
		    moviePage.addMovie(movieTitle, movieYear);
		    
		    String expectedMovieTitle = movieTitle + " (" + movieYear + ")";
			    
		    MoviePage createdMoviePage = new MoviePage(driver);		  
		    Assert.assertEquals(createdMoviePage.getMovieTitle(),expectedMovieTitle);
		  
		    // Assert.assertTrue(homepage.MovieExists(movieTitle));
	
	}

	
}
