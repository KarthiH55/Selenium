package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllicationLaunch5more {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.indianpost.com");
		String A=driver.getTitle();
		String B=driver.getCurrentUrl();
		System.out.println(A);
		System.out.println(B);
	
		driver.get("https://www.indiabix.in");
		String C=driver.getTitle();
		String D=driver.getCurrentUrl();
		System.out.println(C);
		System.out.println(D);
		
		driver.get("https://www.ambitionbox.com");
		String E=driver.getTitle();
		String F=driver.getCurrentUrl();
		System.out.println(E);
		System.out.println(F);
		
		driver.get("https://www.google.com");
		String G=driver.getTitle();
		String H=driver.getCurrentUrl();
		System.out.println(G);
		System.out.println(H);
		
		driver.get("https://www.instagram.com");
		String I=driver.getTitle();
		String J=driver.getCurrentUrl();
		System.out.println(I);
		System.out.println(H);
		driver.close();

	}

}
