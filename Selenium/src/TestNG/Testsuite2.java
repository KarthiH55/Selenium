package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testsuite2 {
	@Test
	public void script1()
	{
		Reporter.log("Valid", true);
	}
	@Test
	public void script2()
	{
		Reporter.log("Invalid", false);
	}
}
