package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentselenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		WebElement Kan = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		for(int i=1; i<4;i++)
		{
        Actions act=new Actions(driver);
        act.contextClick(Kan).perform();
        Robot ro=new Robot();
        ro.keyPress(KeyEvent.VK_T);
        ro.keyRelease(KeyEvent.VK_T);
        Thread.sleep(2000);
		}
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<>(id);
		String A = arr.get(1);
		String B = arr.get(2);
		String C = arr.get(3);
		driver.switchTo().window(A);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.switchTo().window(B);
		driver.get("https://www.Amazon.com");
		
		
		/*for(String arr1:arr)
		{
		driver.switchTo().window(arr1);
		if(arr1.equals(A))
		{
			driver.get("https://www.facebook.com");
		}
		else if(arr1.equals(B))
		{
			driver.get("https://www.Amazon.com");
		}
		}*/
		Thread.sleep(2000);
		driver.switchTo().window(A);
		Thread.sleep(2000);
		WebElement DF=driver.findElement(By.id("email"));
		Thread.sleep(2000);
		DF.sendKeys("karthikh902@gmail.com");
		WebElement DA=driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		DA.sendKeys("7032022191");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(B);
		Thread.sleep(4000);
		driver.close();
		
	}
		

}
