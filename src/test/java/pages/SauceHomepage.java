package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SauceHomepage {

	public SauceHomepage(){
		PageFactory.initElements(ChromeDriver.getDriver(),this);
	}
	
}
