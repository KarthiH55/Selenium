package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BookmyshowAssignment {

	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='BANG']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-content='Kabzaa']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='2D']")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//button[@class='No thanks']")).click();
        WebElement Bhar = driver.findElement(By.xpath("//a[text()='Bharathi Theatre (Peenya) A/C 4K Digital Cinema']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", Bhar);
        Bhar.click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("//div[contains(text(),('10:00 AM'))]")).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("//div[text()='Accept' and @id='btnPopupAccept']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[text()='3']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Select Seats')]")).click();
        Thread.sleep(20000);
        WebElement Cli = driver.findElement(By.xpath("//div[text()='GOLD-Rs. 200.00']/../../following-sibling::tr[1]/td[2]/div[1]"));
        Cli.click();
        for(int i=1; i<=3; i++)
        {
        boolean Sel = Cli.isSelected();
        System.out.println(Sel);
        }
	}

}
