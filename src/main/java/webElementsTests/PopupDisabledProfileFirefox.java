package webElementsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class PopupDisabledProfileFirefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "/Users/ydande/Downloads/geckodriver"); 
	ProfilesIni profiles = new ProfilesIni();
	FirefoxProfile profile = profiles.getProfile("PopupDisabled");
	profile.setPreference("dom.popup_maximum", 0);
	profile.setPreference("privacy.popups.showBrowserMessage", false);
	FirefoxOptions option=new FirefoxOptions();
	option.setProfile(profile);
	WebDriver driver = new FirefoxDriver(option);
	//WebDriver driver = new FirefoxDriver();
	driver.get("https://www.pogo.com/misc/popup-blocker-test-popup1.jsp");
}
}
