package testNG_Basics;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements testNG Listners.  Listeners means monitoring the test cases/methods result and take action
//accordingly based on your instructions

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("You are caught in onTestSuccess Listener block");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		//Normally used for take screenshots, API failure response logs
		System.out.println("You are caught in onTestFailure Listener block");
		//finding the test name of failed one using ITestResult
		System.out.println("Failed Test name = " + result.getName());
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
}
