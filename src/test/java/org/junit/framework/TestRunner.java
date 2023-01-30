package org.junit.framework;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result runclasses = JUnitCore.runClasses(SuiteLevelClass.class);
		List<Failure> failures = runclasses.getFailures();
		for (Failure failure : failures) {
			String string = failure.toString();
			System.out.println(string);	
		}
		System.out.println(runclasses.wasSuccessful());

}
}
