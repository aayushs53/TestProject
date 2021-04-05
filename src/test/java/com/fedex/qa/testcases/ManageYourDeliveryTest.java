package com.fedex.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fedex.qa.base.TestBase;
import com.fedex.qa.pages.HomePage;
import com.fedex.qa.pages.ManageYourDeliveryPage;
public class ManageYourDeliveryTest extends TestBase {
	
	HomePage HomePage;
	ManageYourDeliveryPage ManageYourDeliveryPage;
	public ManageYourDeliveryTest() {
		super();
	}
	@BeforeMethod
	public void setup(){
		initialization();
		HomePage=new HomePage();
		ManageYourDeliveryPage=HomePage.ClickManageYourDeliveryLink();
	}
	@Test
	public void ManageYourDeliveryTest() {
		String Title= ManageYourDeliveryPage.validateManageYourDeliveryPageTile();
		Assert.assertEquals(Title, "FedEx Delivery Manager - Customize Your Home Delivery");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
