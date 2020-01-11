package com.ReviewClass2;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Frames extends CommonMethods {
	public static void main(String[] args) {

		setUp("Chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("iFrame")).click();
		
		switchToFrame("mce_0_ifr");
		
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).click();
		
		
	}

}
