package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://in.search.yahoo.com/?fr2=inr");
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//div[text()='Sign In']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("karthikh151998@yahoo.com");
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//input[@name='signin']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Karthih151998@");
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//div[@class='icon mail']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//a[@href='/d/compose/']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("ashwini98m@yahoo.com");
	    driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Medhavi");
	    driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Good girl");
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//span[text()='Send']")).click();
	    /*driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("qspider bangalore");
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//div[@role='button']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//html/body/div[1]/div[3]/div/div/div[1]/div/div/div/div/ol/li[1]/div/div[1]/h3/a")).click();*/
	}

}
