package day7_select_alert_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlertPopups {

	
	public static void main(String[]args) {
		
	}
	
	
	public static void selectDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// go to https://demoqa.com/select-menu
		driver.get("https://demoqa.com/select-menu");
		
		// select Home and Kitchen from the All departments dropdown
		WebElement colors = driver.findElement(By.id("OldSelectMenu"));
		
		Select letsSelect = new Select(colors);
		Thread.sleep(500);
		
		//select by visible text
		letsSelect.selectByVisibleText("Black");
		
		Thread.sleep(2000);
		//select by index
		letsSelect.selectByIndex(4);
		
		Thread.sleep(2000);
		//select by value
		letsSelect.selectByValue("10");
	}
	
	
}
