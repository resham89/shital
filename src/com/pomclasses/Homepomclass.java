package com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepomclass {

WebDriver driver;
@FindBy(xpath="//div[@data-cy='LanguageSwitcherWidget']")
WebElement lang;
public void lang()
{
	lang.click();
}

@FindBy(xpath="//label[text()='हिंदी']")
WebElement hindi;
public void hindi()
{
	hindi.click();
}

@FindBy(xpath="//button[text()='Apply']")
WebElement apply;
public void apply()
{
	apply.click();
}



public Homepomclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}



}
