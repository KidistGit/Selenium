package com.ReviewClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// I want to be able to confirm that there are 45 links on the "Welcome to the Internet"
//home pageAs a stakeholder,
//I want to be able to verify that the text to each hyperlink and match 
//each hyperlink with the respective text
//Note for testers: Please write clean code and comment on each line of code 
//what is the function being performed so that
//our client side members can read your code and understand what is going on	

import com.utils.CommonMethods;

public class Task2Review extends CommonMethods {
	public static final String WelcomeToTheInternetUrl = "https://the_internet.herokuapp.com";
	public static void main(String[] args) throws InterruptedException {

	CommonMethods.setUp("chrome", WelcomeToTheInternetUrl);

		List<WebElement> link = driver.findElements(By.tagName("a"));
		int numberOflink = link.size();

		System.out.println("Number of the link"+" "+numberOflink);

		for (WebElement link1 : link) {
	System.out.println(link1.getText()+"Number of link"+link1.getAttribute("href"));

		}
		//driver.quit();
	}
}
