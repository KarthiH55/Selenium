package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InfyStock {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(15000);
		 driver.findElement(By.id("search_str")).sendKeys("infy");
		 driver.findElement(By.xpath("//a[@title='Submit']")).click();
		//WebElement Info = driver.findElement(By.xpath("//h1[text()='Infosys Ltd.']/../../preceding-sibling::div/../following-sibling::div[2]//div[@id='nsecp']"));
		WebElement Info = driver.findElement(By.xpath("(//h1[text()='Infosys Ltd.']/../../preceding-sibling::div/../following-sibling::div[2]//div/div/div/div/div//div/following-sibling::div[1])[1]"));
		
		//WebElement Info = driver.findElement(By.xpath("//h1[text()='Infosys Ltd.']/../../preceding-sibling::div/../following-sibling::div[2]//input[@id='nsespotval']"));
		//WebElement Info = driver.findElement(By.xpath("//h1[text()='Infosys Ltd.']/../../../..//div[@id='nsecp']"));
		//WebElement Info = driver.findElement(By.xpath("//h1[text()='Infosys Ltd.']/ancestor::div//div[@id='nsecp']"));
		 String Price = Info.getAttribute("value");
		System.out.println(Price);
		}

}
