package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testbase.Testbase;

public class MoveToElement extends Testbase {

	public void movetoelement(WebElement element) {
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
	
	}
	
	
	
	
}
