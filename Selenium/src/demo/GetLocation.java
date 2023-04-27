package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Point Size = ele.getLocation();
		System.out.println(Size);
		int X = ele.getLocation().getX();
		System.out.println(X);
		int Y = ele.getLocation().getY();
		System.out.println(Y);
		

	}

}
