package org.example.selenium.futureprocessing;

import org.example.selenium.Scenario;
import org.example.selenium.google.GoogleHomePage;

public class EnterFutureProcessingPageViaGoogleSearchScenario implements Scenario<GoogleHomePage, FutureProcessingHomePage> {
	@Override
	public FutureProcessingHomePage run(GoogleHomePage entry) {
		return entry.search("future processing").selectNthResult(0);
	}
}
