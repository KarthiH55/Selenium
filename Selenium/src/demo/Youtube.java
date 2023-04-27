package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		
       /* System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.youtube.com/");
        Thread.sleep(1000);
        driver1.findElement(By.cssSelector("input[id='search']")).sendKeys("Ranjithame");
        driver1.findElement(By.cssSelector("button[aria-label='Search']")).click();
        Thread.sleep(2000);
        driver1.findElement(By.cssSelector("a[id='video-title']")).click();
        Thread.sleep(10000);
        driver1.close();*/
        System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Ranjithame");
        driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/watch?v=unQlCp-lL6I']")).click();
        Thread.sleep(2000);
        

	}

}
