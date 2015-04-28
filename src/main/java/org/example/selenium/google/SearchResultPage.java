package org.example.selenium.google;

import java.util.List;

import org.example.selenium.Page;
import org.example.selenium.futureprocessing.FutureProcessingHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends Page {
	@FindBy(css = "li.g div.rc > h3.r > a")
	List<WebElement> results;

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	public FutureProcessingHomePage selectNthResult(int n) {
		results.get(n).click();
		return new FutureProcessingHomePage(driver);
	}
}
