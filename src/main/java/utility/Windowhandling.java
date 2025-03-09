package utility;

import java.util.ArrayList;
import java.util.Set;

import testbase.Testbase;

public class Windowhandling extends Testbase{

	public void windowhan(int index) {
		
	Set<String> parentandchildid = driver.getWindowHandles();
	
	ArrayList<String> d = new  ArrayList(parentandchildid);
	
	driver.switchTo().window(d.get(index));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
