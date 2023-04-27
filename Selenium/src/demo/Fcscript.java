package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fcscript {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./Software/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		String key1="webdriver.chrome.driver";
		String value1="./Software/chromedriver.exe";
		System.setProperty(key1, value1);
		ChromeDriver driver1=new ChromeDriver();

	}

}
