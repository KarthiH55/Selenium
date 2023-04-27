package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotWebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement Text = driver.findElement(By.name("q"));
        Text.sendKeys("HI");
        File SRC =Text.getScreenshotAs(OutputType.FILE);
        File DTC=new File("./ScreenShot/GoogleElement.jpeg");
		try {
			FileHandler.copy(SRC, DTC);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}

	}
}
