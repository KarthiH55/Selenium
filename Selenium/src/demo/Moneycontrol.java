package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Moneycontrol {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(15000);
		WebElement AE = driver.findElement(By.xpath("(//a[.='Most Active']/../../following-sibling::div//tbody/tr/td[2]/b[1])[1]"));
		Thread.sleep(2000);
		String Price1 = AE.getText();
		Thread.sleep(2000);
		System.out.println(Price1);
		WebElement AP = driver.findElement(By.xpath("(//a[text()='Most Active']/../../following-sibling::div//tbody/tr[2]//td[2]/b)[1]"));
		Thread.sleep(2000);
		String Price2 = AP.getText();
		Thread.sleep(2000);
		System.out.println(Price2);
		WebElement AE1 = driver.findElement(By.xpath("(//a[.='Top Gainers']/../../following-sibling::div//tbody/tr/td[2]/b[1])[1]"));
		Thread.sleep(2000);
		String Price3 = AE1.getText();
		Thread.sleep(2000);
		System.out.println(Price3);
		WebElement AP1 = driver.findElement(By.xpath("(//a[text()='Top Gainers']/../../following-sibling::div//tbody/tr[2]//td[2]/b)[1]"));
		Thread.sleep(2000);
		String Price4 = AP1.getText();
		Thread.sleep(2000);
		System.out.println(Price4);
		WebElement AE2 = driver.findElement(By.xpath("(//a[.='Top Losers']/../../following-sibling::div//tbody/tr/td[2]/b[1])[1]"));
		Thread.sleep(2000);
		String Price5 = AE2.getText();
		Thread.sleep(2000);
		System.out.println(Price5);
		WebElement AP2 = driver.findElement(By.xpath("(//a[text()='Top Losers']/../../following-sibling::div//tbody/tr[2]//td[2]/b)[1]"));
		Thread.sleep(2000);
		String Price6 = AP2.getText();
		Thread.sleep(2000);
		System.out.println(Price6);
		
		
		
		
	}

}
