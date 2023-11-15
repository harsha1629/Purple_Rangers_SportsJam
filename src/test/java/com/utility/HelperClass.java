package com.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	private static WebDriver driver;

	private static HelperClass helperClass;

	public HelperClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	public void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getdriver() {
		return driver;

	}

	public void setDriver() {
		if (helperClass == null) {
			helperClass = new HelperClass();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		helperClass = null;
	}
}
