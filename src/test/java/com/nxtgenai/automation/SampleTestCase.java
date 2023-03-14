package com.nxtgenai.automation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestCase {

	static WebDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void aajtakSearch() throws InterruptedException
	{	
		driver.navigate().to("https://nxtgenaiacademy.com/");
		System.out.println("Title of page is "+driver.getTitle());
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(2000);
	}
}
