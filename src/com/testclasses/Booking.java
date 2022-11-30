package com.testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pomclasses.Loginpomclass;

public class Booking extends Testbaseclass {

@Test
public void method()
{
	Loginpomclass x=new Loginpomclass(driver);
       x.hotel(); 
       x.city();
       x.mumbai();
       x.date();
       x.date2();
       x.apply();
       x.search();
	String actual=driver.getTitle();
	String expect="MakeMyTrip";
	Assert.assertEquals(actual, expect);
}




}
