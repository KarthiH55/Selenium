package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmnetUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box"); 
		Thread.sleep(1000);
		WebElement A=driver.findElement(By.id("userName"));
		A.sendKeys("Karthik H");
		WebElement B=driver.findElement(By.id("userEmail"));
		B.sendKeys("karthikh@gmail.com");
		WebElement C=driver.findElement(By.id("currentAddress"));
		C.sendKeys("Byraveshwara nagar doddabidarakallu nagasandra post bangalore-560073");
		WebElement D=driver.findElement(By.id("permanentAddress"));
		D.sendKeys("Hemavathi sri satya sai zilla amarapuram andrapradesh");
		Thread.sleep(1500);
		driver.findElement(By.id("submit")).click();

	}

}
