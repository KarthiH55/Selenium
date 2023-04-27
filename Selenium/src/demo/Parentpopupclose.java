package demo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parentpopupclose {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	 driver.findElement(By.id("windowButton")).click();
	driver.findElement(By.id("messageWindowButton")).click();
	
	String id = driver.getWindowHandle();
	System.out.println(id);
	Set<String> id1 = driver.getWindowHandles();
	ArrayList<String> arr=new ArrayList<>(id1);
	for(String arr1:arr)
	{
		driver.switchTo().window(arr1);	
		if(arr1.equals(id))
		{
		driver.close();
	}
		else {
			System.out.println("Iam not closing");
		}
		
}

}
}



