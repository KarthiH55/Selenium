package TestNG;

import org.testng.annotations.Test;

public class Ecommerce {

	@Test(priority = 1,invocationCount = 5)//Priority will give preference for executing the script
    public void Signup()
    {
    System.out.println("Create");	
    }
	@Test(priority = 2,invocationCount = 5)//invocationCount is give for regression testing for executing the script multiple times
	public void Login()
	{
	System.out.println("Enter Valid Cred");	
	}
	@Test(priority = 3,invocationCount = 2)//We can provide priority from 0 and also -ve value also (lower the number higher the priority)
	public void Cart()
	{
		System.out.println("Add items");
	}
	@Test(priority = 4,invocationCount = 0)//if we provide invocationCount=0 then that particular script will not execute
	public void Payment()
	{
		System.out.println("Pay amount");
	}
	@Test(priority = 5,invocationCount = 2,enabled = false)//enabled will provide to disabled the testScript
	public void Logout()
	{
		System.out.println("Logout....");
	}
}
