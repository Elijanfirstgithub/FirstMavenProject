package day8_Select_Alert_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class MultiSelectDemo {

	public static void main(String[]args) throws InterruptedException {
		selectMultiDeselectDemo();
	}
	
	
	public static void selectMultiDeselectDemo() throws InterruptedException {
		WebDriverDecorator driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// go to https://demoqa.com/select-menu
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.xpath("//div[text()='Select...']")).click();
		Thread.sleep(2000);
		
		// find the green and click
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		
		// select green, blue and black from multi select dropdown
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		
		driver.findElement(By.xpath("//div[text()='Black']")).click();
		Thread.sleep(1000);
	    // deselect the black
		//*[@id="selectMenuContainer"]/div[7]/div/div/div/div[1]/div[3]/div/div[2]
		
		driver.findElement(By.xpath("(//div[@class='css-xb97g8'])[3]")).click();
		
	}	
	}