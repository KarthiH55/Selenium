package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PassHelloworldandclearfromreverse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/karth/OneDrive/Desktop/10Textfield.html");
		List<WebElement> text = driver.findElements(By.xpath("//input"));
		Thread.sleep(1000);
		for(int i=0; i<text.size() ; i++)
		{
		text.get(i).sendKeys("Hello World I am QA");
		}
		Thread.sleep(2000);
        for(int i=text.size()-1; i>=0;i--)
        {
        text.get(i).clear();
        }
	}

}
