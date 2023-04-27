package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationLaunch5appandTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.amazon.in");
		 String title=driver.getTitle();
		 String url=driver.getCurrentUrl();
		 System.out.println(title);
		 System.out.println(url);
		 driver.get("https://www.facebook.in");
		 String title1=driver.getTitle();
		 String url1=driver.getCurrentUrl();
		 System.out.println(title1);
		 System.out.println(url1);
	     driver.get("https://www.flipkart.com");
		 String title2=driver.getTitle();
		 String url2=driver.getCurrentUrl();
		 System.out.println(title2);
		 System.out.println(url2);
		 driver.get("https://www.meesho.in");
		 String title3=driver.getTitle();
		 String url3=driver.getCurrentUrl();
		 Thread.sleep(2000);
		 System.out.println(title3);
		 System.out.println(url3);
		 driver.get("https://www.phonepe.com");
		 String title4=driver.getTitle();
		 String url4=driver.getCurrentUrl();
		 Thread.sleep(2000);
		 System.out.println(title4);
		 System.out.println(url4);
		 

	}

}
