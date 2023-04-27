package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement Parent = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(Parent));
		Thread.sleep(20000);
		driver.switchTo().frame(Parent);
		String Title = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		Thread.sleep(20000);
		System.out.println(Title);
		WebElement child = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	    driver.switchTo().frame(child);
	    Thread.sleep(2000);
	    String Title1 = driver.findElement(By.xpath("//p[.='Child Iframe']")).getText();
	    Thread.sleep(2000);
		System.out.println(Title1);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
