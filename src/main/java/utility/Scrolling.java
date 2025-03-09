package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testbase.Testbase;

public class Scrolling extends Testbase {

	
	public static  void scrolluptoelement(WebElement element) {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
