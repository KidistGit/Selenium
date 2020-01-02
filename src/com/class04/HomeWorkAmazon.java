package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class HomeWorkAmazon extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", "https://www.amazon.com/");
		WebElement deprt = driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(2000);
		Select select = new Select(deprt);
		List<WebElement> deps = select.getOptions();
		System.out.println("amount of Departments" + deps.size());
		for (WebElement dp : deps) {
			System.out.println(dp.getText());

		}
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		driver.quit();

	}
}
