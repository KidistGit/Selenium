package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task extends CommonMethods {

	public static final String Jiravam_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {

		// Opening the browser with url
		CommonMethods.setUp("chrome", Jiravam_URL);
		
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();

		WebElement maleRadioB = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));

		System.out.println(maleRadioB.isSelected());
		maleRadioB.click();
		System.out.println(maleRadioB.isSelected());
		System.out.println("*******************");

		List<WebElement> radioButtons = driver.findElements(By.name("optradio"));

		for (int i = 0; i < radioButtons.size(); i++) {

			radioButtons.get(i).click();


	
		}

	}
}

