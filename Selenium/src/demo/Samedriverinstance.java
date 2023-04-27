package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Samedriverinstance 
{
	public static WebDriver driver;

	public static void Chrome()
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void FireFox()
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	    driver=new FirefoxDriver();
	}
	public static void main(String[] args) throws InterruptedException {
		Chrome();
		FireFox();
		Thread.sleep(2000);
		driver.close();	
			}
	
	}

