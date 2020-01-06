 package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
/*Open chrome browser
**Go to “https://the-internet.herokuapp.com/”
**Click on “Click on the “Dynamic Loading” link
**Click on “Example 1...” and click on “Start”
**Verify element with text “Hello World!” is displayed
**Close the browser
 */
public class Task1 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException  {
		
		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"finish\"]/h4")));
		boolean displayed = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed();
		if (displayed) {
			System.out.println("IsDisplayed");
		} else {
			System.out.println("NotDisplayed");
		}
		Thread.sleep(3000);
		driver.quit();
}
}