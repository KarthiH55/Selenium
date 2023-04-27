package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KesariyaSong {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=g6fnFALEseI");
		String A=driver.getTitle();
		String B=driver.getCurrentUrl();
		System.out.println(A);
		System.out.println(B);


	}

}
