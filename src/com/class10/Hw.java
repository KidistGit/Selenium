package com.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class Hw extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://jqueryui.com/");

		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		System.out.println("Successfull test  passed");

		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		//call method getScreenshotAs and specify output type
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			//copy file to the specified destination and give name and extension
		FileUtils.copyFile(screen, new File("screenshot/jqueryui.scrshot.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.quit();
		
	}

}
