package org.example.selenium.futureprocessing;

import org.example.selenium.Scenario;
import org.example.selenium.google.GoogleHomePage;

public class EnterFutureProcessingPageViaGoogleSearchScenario implements Scenario<GoogleHomePage, FutureProcessingHomePage> {
	private long timeout = 10;

	public EnterFutureProcessingPageViaGoogleSearchScenario timeout(long timeout) {
		this.timeout = timeout;
		return this;
	}

	@Override
	public FutureProcessingHomePage run(GoogleHomePage entry) {
		return entry
				.search("future processing")
				.waitForSearchResults(timeout)
				.selectNthResult(0);
	}
}
