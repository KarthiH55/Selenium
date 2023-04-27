package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    Thread.sleep(2000);
        WebElement Rome = driver.findElement(By.id("box6"));
        WebElement Italy = driver.findElement(By.id("box106"));
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.dragAndDrop(Rome, Italy).perform();
        WebElement Washington = driver.findElement(By.id("box3"));
        WebElement US = driver.findElement(By.id("box103"));
        act.dragAndDrop(Washington,US).perform();
        Thread.sleep(2000);
        WebElement Madrid = driver.findElement(By.id("box7"));
        WebElement Spain = driver.findElement(By.id("box107"));
        act.dragAndDrop(Madrid,Spain).perform();
        Thread.sleep(2000);
        WebElement Oslo = driver.findElement(By.id("box1"));
        WebElement Norway = driver.findElement(By.id("box101"));
        act.dragAndDrop(Oslo,Norway).perform();
        Thread.sleep(2000);
        WebElement Stockholm = driver.findElement(By.id("box2"));
        WebElement Sweden = driver.findElement(By.id("box102"));
        act.dragAndDrop(Stockholm,Sweden).perform();
        Thread.sleep(2000);
        WebElement Copenhagen = driver.findElement(By.id("box4"));
        WebElement Denmark = driver.findElement(By.id("box104"));
        act.dragAndDrop(Copenhagen,Denmark).perform();
        Thread.sleep(2000);
        WebElement Seoul = driver.findElement(By.id("box5"));
        WebElement Southkorea = driver.findElement(By.id("box105"));
        act.dragAndDrop(Seoul,Southkorea).perform();
        Thread.sleep(2000);
        
        
	}

}
