package com.class11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("");

	
	
	
	}

}
