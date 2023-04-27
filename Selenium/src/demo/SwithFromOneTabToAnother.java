package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwithFromOneTabToAnother {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
       // driver.findElement(By.xpath("//button[.='No thanks']")).click();
        
		WebElement Kan = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
        Actions act=new Actions(driver);
        act.contextClick(Kan).perform();
        Robot ro=new Robot();
        ro.keyPress(KeyEvent.VK_T);
        Set<String> ac = driver.getWindowHandles();
        ArrayList<String> arr=new ArrayList<>(ac);
        for(String arr1:arr)
        {
        	
        	driver.switchTo().window(arr1);	
        }
        
       
        
	}

}
