package org.example.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumTest {
	protected static WebDriver driver;

	@BeforeClass
	public static void initializeWebDriver() {
		driver = new FirefoxDriver(new DesiredCapabilities());
	}

	@AfterClass
	public static void closeWebDriver() {
		driver.close();
	}

}
