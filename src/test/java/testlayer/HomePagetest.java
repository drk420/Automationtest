package testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageLayer.HomePage;
import testbase.Testbase;

public class HomePagetest extends Testbase{

	@Test
	public void HomePagetest() throws InterruptedException {
		String ExpectedResult="Video Games Online at Best Prices In India | Flipkart.com";
		
		HomePage homepage = new HomePage(driver);
		homepage.moveoverelement();
		
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	

	
	
	
	
	
	
	
	
	
}
