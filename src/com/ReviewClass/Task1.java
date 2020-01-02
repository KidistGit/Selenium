package com.ReviewClass;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods {
	public static final String WelcomeToTheInternetUrl = "https://the_internet.herokuapp.com";
	public static void main(String[] args) throws InterruptedException {

	CommonMethods.setUp("chrome", WelcomeToTheInternetUrl);

	driver.findElement(By.partialLinkText("Dynamic Content")).click();
	System.out.println("Dynamic content display");
	
	Thread.sleep(200);
	driver.navigate().back();
	
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Dynamic Controls")).click();
	Thread.sleep(2000);
	System.out.println("Dynamic Controls dispaly");
	
	
	
	
	
	
	
	
}
}
