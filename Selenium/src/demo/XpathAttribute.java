package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAttribute {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com");
    WebElement Ele = driver.findElement(By.xpath("//input[@id='email']"));
    Ele.sendKeys("karthikh.rpcm10@gmail.com");
    WebElement Ele1 = driver.findElement(By.xpath("//input[@id='pass']"));
    Ele1.sendKeys("Karthikh151998@");
    WebElement Ele2 = driver.findElement(By.xpath("//button[@type='submit']"));
    Ele2.click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//a[@aria-label='Friends']")).click();
	}

}
