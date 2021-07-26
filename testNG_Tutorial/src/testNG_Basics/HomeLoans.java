package testNG_Basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class HomeLoans {

    @Parameters({"URL","Module"})
	@Test
	public void Homes(String URLname, String Mod) {
		System.out.println("Home Loan sanctioned");
		System.out.println(URLname);
		System.out.println(Mod);
			}

	@Test
	public void HomeR() {
		System.out.println("Home Loan Rejected");
		
	}
	@Parameters({"URL"})
	@Test
	public void HomeH(String URLname) {
		System.out.println("Home Loan on Hold");
		System.out.println(URLname);
	}
}
