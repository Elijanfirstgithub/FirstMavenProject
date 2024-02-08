package day11_framwork_driver_utilities;

import org.openqa.selenium.WebDriver;

public class Java_concepts {

	public static void main(String[]args) {
		System.out.println(concatinatedStrings("Hello ", "World"));
	}
	
	//create a method that accepts a webElement and returns the text of the webElement as a String
	
	
	
	// create a function that accepts a webElement and clicks on the webElement
	public static void clickOnElment(WebDriver, WebElement) {
		if(element.isDisplayed() && element.isEnabled()) {
			element.click();
			System.out.println("Clicked on the WebElement");
		}else {
			System.out.println("WebElement is not clicked");
		}
	}

	/*
	 * create a function that accepts two strings and returns a concatinated string of those two
	 */
	
	public static String concatinatedStrings(String x, String y) {
		// return x+y;
		return x.concat(y);
	}
	
	
	
	
	
	
	

}
