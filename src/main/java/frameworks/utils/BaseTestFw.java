package frameworks.utils;

import static frameworks.utils.DriverManagerFactoryFw.quitDriver;
import static frameworks.utils.DriverManagerFactoryFw.setDriver;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class BaseTestFw {
	private static WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
	
	@AfterClass
	public static void tearDown() {
		quitDriver();
	}
}
