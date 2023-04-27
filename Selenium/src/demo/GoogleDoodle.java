package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDoodle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/doodles");
		driver.findElement(By.partialLinkText("Sri Lanka Independence Day")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("minimize")).sendKeys("Lovers Day");
		driver.findElement(By.id("searchbtn")).click();


	}

}
