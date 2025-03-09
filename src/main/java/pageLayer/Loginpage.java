package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;
import utility.Scrolling;
import utility.SizeandPosition;
import utility.Windowhandling;

public class Loginpage extends Testbase {

	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username_textbox;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")
	private WebElement login_button;
	
	@FindBy(xpath="//a[contains(text(),'LinkedIn')]")
	private WebElement in_link;
	
	public void clickonin() {
		Scrolling.scrolluptoelement(in_link);
		in_link.click();
		

	}
	public void enterusername(String username) {
		username_textbox.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		password_textbox.sendKeys(password);
	}
	
	
	public void clickonloginbutton()  {
		
		login_button.click();
	}
	
	public void sizeandpositon() {
		SizeandPosition j = new SizeandPosition();
		j.position();
		j.size();
	}
	
	public void newwindow() {
		Windowhandling w = new Windowhandling();
		w.windowhan(1);
	}
	
	
	
	
}
