package webElementsTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "/Users/ydande/Downloads/geckodriver"); 
	WebDriver driver =  new FirefoxDriver();
	driver.get("http://demo.guru99.com/V4");
	driver.findElement(By.name("uid")).sendKeys("mngr99261");
	driver.findElement(By.name("password")).sendKeys("hyqYpEm");
	driver.findElement(By.name("btnLogin")).click();
	driver.findElement(By.linkText("Delete Customer")).click();
	driver.findElement(By.name("cusid")).sendKeys("99415");
	driver.findElement(By.name("AccSubmit")).click();
	
	Alert alert = driver.switchTo().alert();
	
	//alert.dismiss();
	String text = alert.getText();
	System.out.println(text);
	alert.accept();
	
  }
}
