package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;
import utility.Dropdown;
import utility.Scrolling;

public class Productpage extends Testbase {

	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")
	private WebElement name_dropdown;
	
	@FindBy(xpath="//option[contains(text(),'Price (low to high)')]")
	private WebElement priceloetohigh_option;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement addtocart_button;
	
	public void handlingnewdropdown(String option) {
		//Dropdown d = new Dropdown();
		//d.dropdownhandling(name_dropdown,option);
		name_dropdown.click();
	
		priceloetohigh_option.click();
	}
	
	public void clickonaddtocartbutton() {
		addtocart_button.click();
	}
	
	public void scrolltoaddtocartbutton() {
		
		Scrolling.scrolluptoelement(addtocart_button);
	}
	
}
