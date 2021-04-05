package com.fedex.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.fedex.qa.base.TestBase;

public class ManageYourDeliveryPage extends TestBase{
	
	
	public ManageYourDeliveryPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateManageYourDeliveryPageTile(){

		return driver.getTitle();

	}

}
