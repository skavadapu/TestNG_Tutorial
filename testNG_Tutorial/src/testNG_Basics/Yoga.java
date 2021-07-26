package testNG_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Yoga {
	
	@Test(groups= {"Smoke"})
	public void yogaTest1() {
		
		System.out.println("Yoga Test Case 1");
	}

	@Test(dependsOnMethods = {"yogaTest1"})
	public void yogaTest2() {
		
		System.out.println("Yoga Test Case 2");
	}
	
	@Test(dataProvider = "getData")
	public void yogaTest3(String Username, String Password) {
		
		System.out.println("Yoga Test Case 1");
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@DataProvider
	@Test
	public Object[][] getData() {
		//Passing 3 sets of username/password combinations
		
		Object[][] data = new Object[3][2];  //means 3 rows and 2 columns i.e. 3 sets of username and pwd data
		
		//first set
		data[0][0] = "First Username";
		data[0][1] = "First Password";
		
		//2nd Set
		data[1][0] = "Second Username";
		data[1][1] = "Second Password";
		
		//3rd Set
		data[2][0] = "Third Username";
		data[2][1] = "Third Password";
		
		return data;
		
		
	
	}
}
