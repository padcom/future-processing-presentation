package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public abstract class Page {
	private static final int MAX_TIME_FOR_PAGE_TO_LOAD = 60000;

	protected final WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
		new WaitForPageToLoad().apply(driver, new String[] { String.valueOf(MAX_TIME_FOR_PAGE_TO_LOAD) });
		PageFactory.initElements(driver, this);
	}

	public <Input extends Page, Output extends Page> Output run(Scenario<Input, Output> scenario) {
		return scenario.run((Input) this);
	}
}
