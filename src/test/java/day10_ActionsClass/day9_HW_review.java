package day10_ActionsClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class day9_HW_review {

	public static void main(String[]args) {
		
	}
	
	public static void guru99_windowHandle() {
		//Test case 1
		
		WebDriverDecorator driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//go to http://demo.guru99.com/popup.php
		driver.get("http://demo.guru99.com/popup.php");
		
		//Click on Click Here button and switch over to next window, provide an email click Submit.
		driver.findElement(By.linkText("Click Here")).click();
		
		// in order to switch to, we need the window ids so that we can make a switch to the right window
		Set<String> windowIds = driver.getWindowHandles();
		
		Iterator<String> iterate = windowIds.iterator();
		
		String firstWindowID = iterate.next();
		
		String secondWindowID = iterate.next();		
		
		
		
	}
	
	
	
	
	
}
