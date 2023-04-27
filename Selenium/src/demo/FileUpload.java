package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.id("uploadFile"));
		Thread.sleep(2000);
		upload.sendKeys("C:\\Personal\\Karthik\\PF\\Form 15G.pdf");
		

	}

}
