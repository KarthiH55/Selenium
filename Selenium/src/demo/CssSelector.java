package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.instagram.com/");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("karkiki10");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Karthikh151998@");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("svg[role='img'")).click();
	}

}
