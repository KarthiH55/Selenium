package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement Fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(Fashion).perform();
		WebElement WM = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		act.moveToElement(WM).click().perform();
	}

}
