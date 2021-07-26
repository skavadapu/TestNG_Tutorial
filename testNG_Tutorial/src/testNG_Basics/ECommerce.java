package testNG_Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ECommerce {
	
	@Test
	public void eCommTest1() {
		System.out.println("Ecommerce Test Case 1");
	}
	
	@Test
	public void eCommTest2() {
		System.out.println("Ecommerce Test Case 2");
	}
	
	@Test
	public void eCommTest3() {
		System.out.println("Ecommerce Test Case 3");
		//Failing this script desperately for checking whether it catches in Listeners
		Assert.assertTrue(false);
	}
	
}
