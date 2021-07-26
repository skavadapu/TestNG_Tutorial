package testNG_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annote_examples {
	
	@AfterTest
	public void annote_test1() {
		
		System.out.println("AFTER TEST: Annote Test Case 1");
		
	}

	@BeforeTest
	public void annote_test2() {
		
		System.out.println("BEFORE TEST: Annote Test Case 2");
	}
	
	@Test
	public void annote_test3() {
		
		System.out.println("Annote Test Case 3");
	}
	
	@Test
	public void annote_test4() {
		
		System.out.println("Annote Test Case 4");
	}
	
	@AfterSuite
	public void annote_test5() {
		
		System.out.println("AFTER SUITE: Annote Test Case 5");
	}
	
	@BeforeSuite
	public void annote_test6() {
		
		System.out.println("BEFORE SUITE: nnote Test Case 6");
	}
	@BeforeMethod
	public void annote_test7() {
		
		System.out.println("BEFORE METHOD: Annote Test Case 7");
	}
	@AfterMethod
	public void annote_test8() {
		
		System.out.println("AFTER METHOD: Annote Test Case 8");
	}
	
	@BeforeClass
	public void annote_test9() {
		
		System.out.println("BEFORE CLASS: Annote Test Case 9");
	}
	@AfterClass
	public void annote_test10() {
		
		System.out.println("AFTER CLASS: Annote Test Case 10");
	}
}
