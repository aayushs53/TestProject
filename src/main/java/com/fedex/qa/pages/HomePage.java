package com.fedex.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fedex.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//img[@class='fxg-header__logo']")
	WebElement fedexLogo;

	@FindBy(xpath="//span[contains(text(),'Shipping')]")
	WebElement ShippingLink;

	@FindBy(xpath="//span[contains(text(),'Tracking')]")
	WebElement TrackingLink;

	@FindBy(xpath="//span[contains(text(),'Design & Print')]")
	WebElement DesignAndPrintLink;

	@FindBy(xpath="//span[contains(text(),'Locations')]")
	WebElement LocationsLink;

	@FindBy(xpath="//span[contains(text(),'Support')]")
	WebElement SupportLink;

	@FindBy(xpath="//span[contains(text(),'Sign Up or Log In ')]")
	WebElement SignUpOrLogInLink;

	@FindBy(xpath="//a[@id='fxg-dropdown-signIn']//img[@class='fxg-user-options__icon']")
	WebElement SignUpOrLogInIcon;

	@FindBy(xpath="//span[@class='fxg-mouse']//img[@class='fxg-user-options__icon']")
	WebElement SearchIcon;
	
	@FindBy(xpath="//a[contains(text(),'Advanced Shipment Tracking')]")
	WebElement AdvanceShipmentTrackingLink;
	
    @FindBy(xpath="//a[contains(text(),'Manage Your Delivery')]")
    WebElement ManageYourDeliveryLink; 
    
   @FindBy(xpath="//input[@name='trackingnumber' and @type='text']")
   WebElement HomePageTrackingIDBox;
   
   @FindBy(xpath="//button[@id='btnSingleTrack']")
   WebElement HomePageTrackButton;
   
   @FindBy(xpath="//ul[@id='e2eGoogleAddressSuggestionList']//li[1]")
   WebElement AutosearchoptionRateandSHip;
   
   @FindBy(xpath="//input[@id='fromGoogleAddress']")
   WebElement FromAddresstab;
   
   @FindBy(xpath="//input[@id='toGoogleAddress']")
   WebElement ToAddresstab;
   
   @FindBy(xpath="//*[contains(text(),'Rate & Ship')]")
   WebElement RateandShipCube;
   
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	

	public String validateHomePageTile(){

		return driver.getTitle();

	}
	public boolean ValidateTrackingLink() {
		return TrackingLink.isDisplayed();
	}
	public boolean ValidateShippingLink() {
		return ShippingLink.isDisplayed();
	}
	public boolean ValidateDesignAndPrintLink() {
		return DesignAndPrintLink.isDisplayed();
	}
	public boolean ValidateLocationsLink() {
		return LocationsLink.isDisplayed();
	}
	public boolean ValidateSupportLink() {
		return SupportLink.isDisplayed();
	}
	public boolean ValidateSignUpOrLogInLink() {
		return SignUpOrLogInLink.isDisplayed();
	}
	public boolean ValidateSearchIcon() {
		return SearchIcon.isDisplayed();
	}
	public AdvanceShipmentTrackingPage ClickAdvanceShipmentTrackingLink()  {
		TrackingLink.click();
		
		AdvanceShipmentTrackingLink.click();
		return new AdvanceShipmentTrackingPage();
	}

	public ManageYourDeliveryPage ClickManageYourDeliveryLink() {
		TrackingLink.click();
		ManageYourDeliveryLink.click();
		return new ManageYourDeliveryPage();
	}
	public void TrackFromHomePage(String TrackingNumber) throws Exception {
		
		HomePageTrackingIDBox.sendKeys(TrackingNumber);
		Thread.sleep(2000);
		HomePageTrackButton.click();
	}
	
	public void ClickRateandShipCube() {
		RateandShipCube.click();
		
	}
	public void ClickFromAddressField(String FromAddress) throws Exception {
		
		FromAddresstab.sendKeys(FromAddress);
		Thread.sleep(2000);
		AutosearchoptionRateandSHip.click();
	}
	public void ClickToAddressField(String ToAddress) throws Exception {
		ToAddresstab.sendKeys(ToAddress);
		Thread.sleep(2000);
		AutosearchoptionRateandSHip.click();
	}

}
