package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver A=new FirefoxDriver();
		A.get("https://www.youtube.com/watch?v=g6fnFALEseI");
		WebElement B=A.findElement(By.xpath("//div[@class='Kesariya']//a/@href"));
		B.findElement(By.id("video-title")).click();
		

	}

}
