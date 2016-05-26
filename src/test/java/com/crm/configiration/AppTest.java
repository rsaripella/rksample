package com.crm.configiration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {
	
@Test

public void test(){
	
	WebDriver wd = new FirefoxDriver();
	
	wd.navigate().to("http://www.google.com");
	wd.manage().window().maximize();
	System.out.println("dwd2d23d23d23d");
}

  
}
