package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropAscending {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	 driver.get("file:///C:/Users/karth/OneDrive/Desktop/SinglewithMultipleDrop.html");
	 Thread.sleep(1000);
	 WebElement ele1 = driver.findElement(By.xpath("//select[@value='1']"));
	 Thread.sleep(1000);
	 Select drop1=new Select(ele1);
	 Thread.sleep(1000);
	 
	 TreeSet<String> treset=new TreeSet<String>();
	 List<WebElement> Option=drop1.getOptions();
	 
	 ArrayList<String> arrlist=new ArrayList<String>(treset);
	 
	 for(WebElement Options:Option)
	 {
		String Text=Options.getText(); 
		arrlist.add(Text);
	 }
	 Collections.sort(arrlist);
	 for(String Sorted:arrlist)
	 {
		 System.out.println(Sorted);
	 }

	}

}
