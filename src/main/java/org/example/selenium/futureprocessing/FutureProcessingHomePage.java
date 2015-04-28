package org.example.selenium.futureprocessing;

import org.example.selenium.Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FutureProcessingHomePage extends Page {
	public FutureProcessingHomePage(WebDriver driver) {
		super(driver);
	}

	public FutureProcessingHomePage assertPageHeaderExists() {
		Assert.assertEquals(1, driver.findElements(By.cssSelector("h1.site-title a.box-link")).size());
		return this;
	}
}
