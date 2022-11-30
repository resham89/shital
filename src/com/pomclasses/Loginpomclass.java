package com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpomclass {
WebDriver driver;
Actions act;

@FindBy(xpath="(//span[@class='chNavText darkGreyText'])[2]")
WebElement hotel;
public void hotel()
{
	hotel.click();
}

@FindBy(xpath="//label[@for='city']")
WebElement city;
public void city()
{
	city.click();
	
}
@FindBy(xpath="(//p[@class='locusLabel appendBottom5'])[2]")
WebElement mumbai;
public void mumbai()
{
	mumbai.click();
}




@FindBy(xpath="//div[@aria-label='Sat Nov 26 2022']")
WebElement date;
public void date()
{
	date.click();
}

@FindBy(xpath="//div[@aria-label='Mon Dec 26 2022']")
WebElement date2;
public void date2()
{
	date2.click();
}

@FindBy(xpath="(//button[@type='button'])[1]")
WebElement apply;
public void apply()
{
	apply.click();
}

@FindBy(xpath="//button[text()='Search']")
WebElement search;
public void search()
{
	search.click();
}


@FindBy(xpath="(//a[text()='BOOK NOW'])[1]")
WebElement tour;
public void tour()
{
	tour.click();
}









public Loginpomclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	act=new Actions(driver);
}




}
