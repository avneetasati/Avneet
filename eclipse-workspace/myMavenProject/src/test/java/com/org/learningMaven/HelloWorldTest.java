package com.org.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HelloWorldTest {

	
@Test

public void test() {
	System.out.println("Avneet Asati");
	System.out.println("Hello");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in");
	Assert.assertTrue(driver.getTitle().contentEquals("Google"));
	driver.close();
}

}
