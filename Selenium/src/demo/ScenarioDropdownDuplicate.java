package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ScenarioDropdownDuplicate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	 driver.get("file:///C:/Users/karth/OneDrive/Desktop/SinglewithMultipleDrop.html");
	 Thread.sleep(1000);
	 WebElement ele1 = driver.findElement(By.xpath("//select[@value='1']"));
	 Thread.sleep(1000);
	 WebElement ele2 = driver.findElement(By.xpath("//select[@value='2']"));
	 Thread.sleep(1000);
	 Select drop1=new Select(ele1);
	 Thread.sleep(1000);
	 Select drop2=new Select(ele2);
	 Thread.sleep(1000);
	 List<WebElement> O1 = drop1.getOptions();
	 Thread.sleep(1000);
	 List<WebElement> O2 = drop2.getOptions();
	 Thread.sleep(1000);
	 for( int i=0 ;i<O1.size(); i++)
	 {
		 String A1 = O1.get(i).getText();
		 for(int j=0;j<O2.size();j++)
		 {
		String A2 = O2.get(j).getText();	
		if(A1.equals(A2))
		{
			System.out.println("Duplicate");
		}
		 }
		 
	 }

	}

}
