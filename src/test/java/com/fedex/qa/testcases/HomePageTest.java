package com.fedex.qa.testcases;

import org.testng.Assert;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fedex.qa.base.TestBase;
import com.fedex.qa.pages.HomePage;
import com.fedex.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	HomePage HomePage;
	TestUtil testutil;
	String sheetName="Tracking Data";
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		HomePage=new HomePage();
		testutil=new TestUtil();
		
	
		
		
	}
		@Test(priority=2)
		public void HomePageTitleTest() {
			
			
			String title = HomePage.validateHomePageTile();
			Assert.assertEquals(title, "FedEx | Tracking, Shipping, and Locations");
		}
		@Test(priority=3)
		public void HomePageHeaderLink() {
			
			
			Boolean Shipping= HomePage.ValidateShippingLink();
			Assert.assertTrue(Shipping);
			
			Boolean DesignAndPrintLink= HomePage.ValidateDesignAndPrintLink();
			Assert.assertTrue(DesignAndPrintLink);
			
			Boolean LocationsLink= HomePage.ValidateLocationsLink();
			Assert.assertTrue(LocationsLink);
			
			Boolean SupportLink = HomePage.ValidateSupportLink();
			Assert.assertTrue(SupportLink);
			
			Boolean SignUpOrLogInLink = HomePage.ValidateSignUpOrLogInLink();
			Assert.assertTrue(SignUpOrLogInLink);
			
			Boolean SearchIcon= HomePage.ValidateSearchIcon();
			Assert.assertTrue(SearchIcon);
	
		
		}
	@DataProvider
	public Object[][] getTrackingTestData()
	{
		
		Object data[][]=testutil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="getTrackingTestData")
	
	public void validateTrackingField(String TrackingNumber) throws Exception {
		//HomePage.TrackFromHomePage("123456789");
		HomePage.TrackFromHomePage(TrackingNumber);
		
	}
	@Test
	public void validateRateandShipField() throws Exception {
		{
			HomePage.ClickRateandShipCube();
			HomePage.ClickFromAddressField("123");
			HomePage.ClickToAddressField("456");
		}
	} 
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
