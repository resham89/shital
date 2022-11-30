package com.testclasses;

import org.testng.annotations.Test;

import com.pomclasses.Loginpomclass;

public class Toury extends Testbaseclass {

	@Test
	public void method()
	{
		Loginpomclass x=new Loginpomclass(driver);
		x.tour();
	}








}
