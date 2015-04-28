package org.example.selenium.futureprocessing;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.selenium.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FutureProcessingHomePage extends Page {
	public FutureProcessingHomePage(WebDriver driver) {
		super(driver);
	}

	public FutureProcessingHomePage assertPageHeaderExists() {
		assertThat(driver.findElements(By.cssSelector("h1.site-title a.box-link")).size()).isEqualTo(1);
		return this;
	}
}
