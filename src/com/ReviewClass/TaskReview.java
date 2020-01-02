package com.ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TaskReview extends CommonMethods {
	public static final String WelcomeToTheInternetUrl = "https://the_internet.herokuapp.com";
	public static void main(String[] args) throws InterruptedException {

	CommonMethods.setUp("chrome", WelcomeToTheInternetUrl);
		driver.findElement(By.linkText("Checkboxes")).click();
	WebElement chekbox=	driver.findElement(By.xpath("//*[@id=\"checkboxes\"]"));
	chekbox.click();
	if(chekbox.isSelected()) {
		System.out.println("Check box 1 was selected");
	}else {
		System.out.println("Check box 1 Was Not Selected ");
	}
		
		

	}

}
