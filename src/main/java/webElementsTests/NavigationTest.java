package webElementsTests;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/ydande/Downloads/geckodriver"); 
		FirefoxDriver driver = new FirefoxDriver();


		driver.get("http://www.gmail.com");

		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward(); 

		// driver.close();
	}
}
