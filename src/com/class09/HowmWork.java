package com.class09;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class HowmWork extends CommonMethods {
	public static void main(String[] args) {
		setUp("chrome", "https://www.aa.com/homePage.do");
		driver.findElement(By.name("destinationAirport")).sendKeys("MCO");
		// driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.destinationAirport\"]")).click();
		driver.findElement(By.name("departDate")).click();
		// find Current month
		String currentMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]"))
				.getText();
		System.out.println(currentMonth);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
		// selecting desired month May
		String selectMonth = "May";
		for (int i = 1; i <= 10; i++) {
			while (!currentMonth.equals(selectMonth)) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
				currentMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]"))
						.getText();
				System.out.println(currentMonth);
				break;
			}
		}
		// selecting desired date 14
		List<WebElement> cellsDate = driver
				.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td"));
		for (WebElement dates : cellsDate) {
			String date = dates.getText();
			if (date.equals("14")) {
				dates.click();
				break;
			}
		}
		// Selecting return date
		// click to return box
		driver.findElement(By.name("returnDate")).click();
		// find the current month first
		String currentMonth2 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]"))
				.getText();
		System.out.println(currentMonth);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
		// selecting return month November
		String selectMonth2 = "November";
		for (int i = 1; i <= 10; i++) {
			while (!currentMonth.equals(selectMonth2)) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
				currentMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]"))
						.getText();
				System.out.println(currentMonth);
				break;
			}
		}
		// selecting the return date 8
		List<WebElement> cellsDate2 = driver
				.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td"));
		for (WebElement dates1 : cellsDate2) {
			String dates = dates1.getText();
			if (dates.equals("8")) {
				dates1.click();
				break;
			}
		}
		// confirm word "flight" is chosen
		String flightWord = driver
				.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[1]/div/ul/li[1]/label/span[2]"))
				.getText();
		System.out.println(flightWord);
		if (flightWord.equals("Flight")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		// Take Screen Shot
		TakesScreenshot ts = (TakesScreenshot) driver;
		// call method getScreenshotAs and specify output type
		File screen = ts.getScreenshotAs(OutputType.FILE);
		try {
			// copy file to the specified destination and give name and extension
			FileUtils.copyFile(screen, new File("screenshots/AAir/SelectDates.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();

	}
}
