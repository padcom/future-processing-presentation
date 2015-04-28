package org.example.selenium;

public interface Scenario<Input extends Page, Output extends Page> {
	Output run(Input entry);
}
