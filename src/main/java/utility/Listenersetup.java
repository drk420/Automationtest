package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import testbase.Testbase;

public class Listenersetup extends Testbase implements ITestListener {

	public void onTestStart(ITestResult result) {
		logger.info(result.getName()+"test start");
	}

	public void onTestSuccess(ITestResult result) {
		logger.info(result.getName()+"test complleted");
	}

	public void onTestFailure(ITestResult result) {
		logger.info("test failed"+result.getName());
		Takesscreenshot.getscreenshot(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		logger.info(result.getName()+"test skipped");
	}

	}
