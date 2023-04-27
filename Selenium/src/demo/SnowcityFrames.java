package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnowcityFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://snowcityblr.com");
		Thread.sleep(2000);
		WebElement Contact = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(Contact));
		Contact.click();
		Thread.sleep(2000);
		WebElement Parent = driver.findElement(By.xpath("(//iframe[@aria-hidden='true'])[1]"));
		
		wait.until(ExpectedConditions.visibilityOf(Parent));
		driver.switchTo().frame(Parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Directions']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
