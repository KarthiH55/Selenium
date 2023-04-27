package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CompareRateAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("hp laptop intel core i3");
		Thread.sleep(2000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		WebElement FRate = driver.findElement(By.xpath("//div[.='HP 15s Intel Core i3 12th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15s-fq5007TU Thin and Light Laptop']/../following-sibling::div[1]/div[1]/div[1]/div[1]"));
		Thread.sleep(3000);
		String Fvalue = FRate.getText();
		Thread.sleep(3000);
		System.out.println(Fvalue);
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hp 15s laptop intel core i3");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        for(int i=1; i<=1; i++)
        {
        	act.sendKeys(Keys.PAGE_DOWN).perform();
        	Thread.sleep(2000);
        }
        WebElement Arate = driver.findElement(By.xpath("//span[.='HP 15s,11th Gen Intel Core i3-1115G4 8GB RAM/512GB SSD 15.6-inch(39.6 cm) Micro-Edge Anti-Glare FHD Laptop/Alexa Built-in/Win 11/Intel UHD Graphics/Dual Speakers/MS Office 2021/1.69 Kg, 15s-fq2673TU']/../../../following-sibling::div[2]/div[1]/div[1]/div[1]/div[2]/a/span[1]"));
        Thread.sleep(2000);
        String Avalue = Arate.getText();
        Thread.sleep(2000);
        System.out.println(Avalue);
        Thread.sleep(2000);
        if(Fvalue>Avalue)
        {
        	
        }
	}

}
