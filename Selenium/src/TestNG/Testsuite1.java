package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testsuite1
{
	@Test                        //(@= means annotations it is one of the java type and provide information to the JVM)
	public void script1()
	{
		Reporter.log("Valid", true);//Reporter is a concrete class and log is a static method
	
	}
	
	@Test
	public void script2()
	{
		Reporter.log("Invalid", false);//Using this we can print the output in both console and report also.(Note: If we give boolean false then we will get output only in report)
	}
}
