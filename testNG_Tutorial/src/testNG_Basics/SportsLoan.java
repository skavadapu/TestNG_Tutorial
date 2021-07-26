package testNG_Basics;


import org.testng.annotations.Test;


public class SportsLoan {
	/* @Parameters({"URL"})
	@Test
	public void CricketA(String URL1name) {
		System.out.println("Cricekt loasn is sanctioned");
		System.out.println(URL1name); */
		
	    @Test
		public void CricketA() {
			System.out.println("Cricekt loan is sanctioned");
	}
	
	@Test
	public void CricektH() {
		System.out.println("Cricket Loan is on Hold");
	}

}