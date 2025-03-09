package testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Testbase {

	
	public static  WebDriver driver;
	public static  Logger logger;
	
	@BeforeTest
	public void setup() {
		logger = Logger.getLogger("Framework Started");
		PropertyConfigurator.configure("log4j.Properties");
		logger.info("Swaglabs");
	}
	
	@AfterTest
	public void close() {
		
		logger.info("framework closed");
	}
	
	@BeforeMethod
	public void start() {
		String br = "chrome";
		
		if(br.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edgedriver")) {
			driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else {
			logger.info("provide correct browser");
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterMethod
	public void closed() {
		//driver.quit();
	}
	
	
	
}
