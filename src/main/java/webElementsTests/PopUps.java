package webElementsTests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUps {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "/Users/ydande/Downloads/geckodriver"); 
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.globalrph.com/davescripts/popup.htm");
	
	WebElement element = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[7]/td/div/table/tbody/tr/td[2]/div[1]/form/table/tbody/tr[4]/td[2]/p/input"));
	element.click();
	
	Set<String> handles = driver.getWindowHandles();
//	for(String s : handles){
//		System.out.println(s);
//	}
	
	Iterator<String> it = handles.iterator();
	
	String mainWin = it.next();
	String popupWin = it.next();
	
	driver.switchTo().window(popupWin);
	
	WebElement label = driver.findElement(By.xpath("/html/body/h2"));
	String text = label.getText();
	System.out.println(text);
}
}
