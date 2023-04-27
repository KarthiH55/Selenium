package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FCquitandclose {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		driver.close();
		driver.quit();
	}

}
