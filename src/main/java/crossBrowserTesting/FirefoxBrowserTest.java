package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver =  new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
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
