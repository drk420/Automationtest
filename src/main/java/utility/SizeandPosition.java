package utility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import testbase.Testbase;

public class SizeandPosition extends Testbase{

	
	public void size() {
		Dimension d = new Dimension(500,700);
		System.out.println(d.getHeight()+d.getWidth());
		
		driver.manage().window().setSize(d);
	}
	
	public void position() {
		Point p = new Point(600,200);
		
		driver.manage().window().setPosition(p);
		
		
		System.out.println(driver.manage().window().getPosition());
	}
	
	
}
