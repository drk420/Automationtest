package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.Testbase;

public class Dropdown extends Testbase {

	
	public void dropdownhandling(String option,WebElement element) {
		
	
		Select o = new Select(element);
		o.selectByVisibleText(option);
		
	List<WebElement> optionsd = o.getOptions();
	
int count 	= optionsd.size();
System.out.println(count);



for(WebElement b : optionsd) {
String text	= b.getText();
System.out.println(text);
}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
