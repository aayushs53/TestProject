package com.fedex.qa.pages;


import org.openqa.selenium.support.PageFactory;

import com.fedex.qa.base.TestBase;

public class AdvanceShipmentTrackingPage extends TestBase{
	
	
	
		
	public AdvanceShipmentTrackingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateAdvanceShipmentTrackingPageTitle(){

		return driver.getTitle();

	}


}
