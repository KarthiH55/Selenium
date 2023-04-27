package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyntraAssignment {

	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Tommy");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class=' row-base'])[4]/following-sibling::div/section/ul/li[6]")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//div[@class='desktop-logoContainer']/../../../../../following-sibling::div[1]/div/div/main/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//h1[text()='Tommy Hilfiger']/../following-sibling::div/div[@id=\"sizeButtonsContainer\"]/following-sibling::div[1]/div/div[1]")).click();
		
		//div[@class="desktop-logoContainer"]/../../../../../following-sibling::div[1]/div/div/main/div[2]/div[2]/div[2]/div[1]/div[2]/div/div

	}

}
