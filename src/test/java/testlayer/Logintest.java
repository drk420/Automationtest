package testlayer;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageLayer.Loginpage;
import pageLayer.Productpage;
import testbase.Testbase;
import utility.SizeandPosition;

public class Logintest extends Testbase {

	@Test
	public void validatelogintest() throws InterruptedException {
		String Expectedresult ="https://www.linkedin.com/company/sauce-labs/";
		Loginpage loginpage = new Loginpage (driver);
		
		
		loginpage.enterusername("standard_user");
		loginpage.enterpassword("secret_sauce");
		
		loginpage.clickonloginbutton();
		Productpage p = new Productpage(driver);
		p.handlingnewdropdown("Price(low to high)");
		Thread.sleep(5000);
		loginpage.clickonin();
		loginpage.newwindow();
		Thread.sleep(5000);
		loginpage.sizeandpositon();
		
		String Actualeresult = driver.getCurrentUrl();
		Assert.assertEquals(Actualeresult,Expectedresult);
		
		
	}

	
	}
	
	
	
	
	
