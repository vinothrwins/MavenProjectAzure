package com.nxtgenai.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {

	// Parameterize all the Input Values
	String url = "https://nxtgenaiacademy.com/";

	@Test
	public void sampleTestCase() {

		System.out.println("Test Case Started");

		// Set the system property for the Edge browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

		// Create the instance of Edge driver in Webdriver interface
		WebDriver driver;driver = new ChromeDriver();

		// Implicity wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch the application
		driver.get(url);

		// Maximize the window
		driver.manage().window().maximize();

		System.out.println("Application Launched Successfully");
		
		driver.quit();

	}
}
