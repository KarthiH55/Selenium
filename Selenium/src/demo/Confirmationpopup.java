package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Confirmationpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement Dbl = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
        actions.doubleClick(Dbl).perform();
        Thread.sleep(2000);
        Alert aler = driver.switchTo().alert();
        Thread.sleep(2000);
        String Text = aler.getText();
        System.out.println(Text);
        Thread.sleep(2000);
		aler.accept();
	}

}
