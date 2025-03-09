package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testbase.Testbase;
import utility.Dropdown;
import utility.MoveToElement;

public class HomePage extends Testbase{

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	private WebElement electronics_image;
	
	@FindBy(xpath="//body/div[4]/div[1]/object[1]/a[5]")
	private WebElement gaming_option;
	
	@FindBy(xpath="//a[contains(text(),'Games')]")
	private WebElement games_options;
	
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]")
	private WebElement All_dropdown;
	
	
	
	public void moveoverelement() throws InterruptedException {
		driver.navigate().to("https://www.flipkart.com/");
		MoveToElement m = new MoveToElement();
		m.movetoelement(electronics_image);
		Thread.sleep(5000);
		m.movetoelement(gaming_option);
		games_options.click();
		
		
	}
	
	
	
	
	
	
	
}
