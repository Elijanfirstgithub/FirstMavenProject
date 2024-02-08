package utils;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	Alert alert;
	WebDriverWait wait;
	Actions act;
	Select select;
	
	// create a method which accepts a webElement, which selects by visible text
	public void selectWithVisibleText() {
		select = new Select(dropdown);
		select.selectByVisibleText(option);
	}
	
	
	public void waitUntilElementVisibleWithLocator(By locator) {
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
	
	
	
	
}
