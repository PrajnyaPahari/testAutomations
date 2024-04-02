package com.base.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUITest {
	@Test
	public void titleTest() {
		String urlString = "http://demo.openemr.io/b/openemr/";
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(urlString);
		String titleString = driver.getTitle();
		String expString = "OpenEMR Login";
		assertEquals(titleString, expString);
	}
	

}
