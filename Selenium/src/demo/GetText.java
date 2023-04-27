package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.selenium.dev/downloads/");
	    driver.manage().window().maximize();
         WebElement ele = driver.findElement(By.xpath("//span[.='Downloads']"));
          String Text = ele.getText();
          System.out.println(Text);

	}

}
