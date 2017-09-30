package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.pages.LoginPage;

public class Test_Steps {
	public static WebDriver driver;
	LoginPage loginPage;
	

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.gecko.driver", "/Users/ydande/Downloads/geckodriver"); 
		driver =  new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qabidder.net/testwave/#/page/login");
		loginPage = new LoginPage(driver);
	}
	
	@When("^User enters Username and Password$")
	public void user_enters_Username_and_Password() throws InterruptedException{
		loginPage.typeUserName("yagna.bitspilani@gmail.com");
		Thread.sleep(4000);
		loginPage.typePassword("1234");
	}
	
	@When("^User clicks Login Button$")
	public void user_clicks_Login_Button(){
		loginPage.clickLoginButton();
	}
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully(){
		String title = driver.getTitle();
		if(!title.contains("yagna.bitspilani")){
			Assert.fail("Not able to login to GMAIL...");
		}
		
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username,String password) throws InterruptedException{
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	
	}
	

}
