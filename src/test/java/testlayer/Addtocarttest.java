package testlayer;

import org.testng.annotations.Test;

import pageLayer.Loginpage;
import pageLayer.Productpage;
import testbase.Testbase;

public class Addtocarttest extends Testbase {

	@Test
	public void validateaddtocarttest() throws InterruptedException  {
        Loginpage loginpage = new Loginpage (driver);
		
		
		loginpage.enterusername("standard_user");
		loginpage.enterpassword("secret_sauce");
		
		loginpage.clickonloginbutton();
		Productpage p = new Productpage (driver);
		p.scrolltoaddtocartbutton();
		
		p.clickonaddtocartbutton();
	}
	
	
}
