package com.testclasses;

import org.testng.annotations.Test;

import com.pomclasses.Homepomclass;

public class Languagechang extends Testbaseclass{
@Test(invocationCount=3)
public void languagechange()
{
	Homepomclass x=new Homepomclass(driver);
	x.lang();
	x.hindi();
	x.apply();
}








}
