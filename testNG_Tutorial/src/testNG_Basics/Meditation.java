package testNG_Basics;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Meditation {
	
	@Test(dependsOnMethods = {"meditateTest3"})  //DependsOnMethods allows to prioritise the scripts/method which script needs to be run first prior to another one
	public void meditateTest1() {
		System.out.println("Meditation Test Case 1");
	}

	@Test(groups= {"Smoke"})  //Groups scripts will be run only when called
	public void meditateTest2() {
		System.out.println("Meditation Test Case 2");
	}
	
	@Test 
	public void meditateTest3() {
		System.out.println("Meditation Test Case 3");
	}


	@Test(enabled=false)  //enabled helper attribute allows to skip the test case
	public void meditateTest4() {
		System.out.println("Meditation Test Case 4");
	}
	
	@Parameters({ "TestURL" })   //Parameters helper attribute allows to pass the global variables from testng3_annotations.xml file
	@Test(groups= {"Smoke"}) 
	public void meditateTest5(String URL) {
		System.out.println("Meditation Test Case 5");
		System.out.println("url came from parameter attribute: " + URL);
	}
	
	@Test 
	public void meditateTest6() {
		System.out.println("Meditation Test Case 6");
	}
}
