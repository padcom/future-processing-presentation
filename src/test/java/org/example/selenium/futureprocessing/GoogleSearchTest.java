package org.example.selenium.futureprocessing;

import org.example.selenium.SeleniumTest;
import org.example.selenium.google.GoogleHomePage;
import org.junit.Test;

public class GoogleSearchTest extends SeleniumTest {
	@Test
	public void search_for_future_processing() {
		new GoogleHomePage(driver)
			.search("future processing")
			.selectNthResult(0)
			.assertPageHeaderExists();
	}

	@Test
	public void search_for_future_processing_using_scenario() {
		new GoogleHomePage(driver)
			.run(new EnterFutureProcessingPageViaGoogleSearchScenario())
			.assertPageHeaderExists();
	}
}
