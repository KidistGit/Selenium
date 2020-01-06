package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DynamicTableDemo extends CommonMethods {
/* Navigate to the Weborders
 * Login into WebOrders
 * Click CheckBox next to Bob Feather
 */
	
	public static void main(String[] args) throws InterruptedException {
		
		
setUp("Chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	
	
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
	//Search for Bob Feather
	String expectedValue="Bob Feather";
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	for(int i=1; i<rows.size(); i++) {
		String rowText=rows.get(i-1).getText();
		//System.out.println(rowText);
		if(rowText.contains(expectedValue)) {
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
		}
	}

	Thread.sleep(4000);
	driver.quit();
	
	
	}


	
}
	

