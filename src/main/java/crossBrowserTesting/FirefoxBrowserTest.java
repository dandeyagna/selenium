package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxBrowserTest {
public static void main(String[] args) throws InterruptedException {
	//https://github.com/mozilla/geckodriver/releases
	System.setProperty("webdriver.gecko.driver", "/Users/ydande/Downloads/geckodriver"); 
	WebDriver driver =  new FirefoxDriver();
	driver.get("http://qabidder.net/testwave/#/page/login");
	Thread.sleep(10000);
	
	//TextBox
	WebElement loginField = driver.findElement(By.xpath("//*[@id='exampleInputEmail1']"));
	loginField.sendKeys("qauber.sa1@mailinator.com");
	WebElement passwordField = driver.findElement(By.xpath("//*[@id='exampleInputPassword1']"));
	passwordField.sendKeys("123456");
	
	//Button
	WebElement loginButton = driver.findElement(By.tagName("button"));
	loginButton.click();
	
	Thread.sleep(4000);
}
}
