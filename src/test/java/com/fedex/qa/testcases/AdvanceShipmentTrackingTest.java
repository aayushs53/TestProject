package com.fedex.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fedex.qa.base.TestBase;
import com.fedex.qa.pages.HomePage;
import com.fedex.qa.pages.AdvanceShipmentTrackingPage;

public class AdvanceShipmentTrackingTest extends TestBase{

	HomePage HomePage;
	AdvanceShipmentTrackingPage AdvanceShipmentTrackingPage;

	public AdvanceShipmentTrackingTest() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		AdvanceShipmentTrackingPage=new AdvanceShipmentTrackingPage();
		HomePage=new HomePage();
		AdvanceShipmentTrackingPage= HomePage.ClickAdvanceShipmentTrackingLink();
	}
		
	@Test
	public void AdvanceShipmentTrackingTest() {
		String title = AdvanceShipmentTrackingPage.validateAdvanceShipmentTrackingPageTitle();
		Assert.assertEquals(title, "The new, advanced FedEx Tracking");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
