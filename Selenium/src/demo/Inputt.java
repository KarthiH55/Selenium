package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inputt {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/karth/OneDrive/Desktop/Input.html");
         WebElement Ele = driver.findElement(By.xpath("//div[4]/input[1]"));
         Ele.sendKeys("Karthik");
         

	}

}
