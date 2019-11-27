package Expedia.expedia.piit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectflight {
	public static WebDriver driver;

	public Selectflight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}

	
	@FindBy(xpath="//li[@id='flight-module-2019-11-30t05:45:00-05:00-coach-ric-ewr-ua-4426_2019-12-07t09:00:00-05:00-coach-ewr-ric-ua-4080_']//div[contains(@class,'grid-container standard-padding')]//button[@class='btn-secondary btn-action t-select-btn']")
   WebElement flight;
	
	@FindBy(xpath="//div[@id='basic-economy-tray-content-1']//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement confirmflight;
	
	
	@FindBy(xpath="/html/body/div[2]/div[10]/section/div/div[11]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button")
  WebElement returnflight;
	
	@FindBy(xpath="/html/body/div[2]/div[10]/section/div/div[11]/ul/li[1]/div[2]/div/div/div/div[1]/button")
	WebElement confirmreturnflight;
	
	@FindBy(xpath="//a[@id='forcedChoiceNoThanks']")
	WebElement nothanks;
	
	
	
	
public void flight () {
	flight.click();
}


public void confirmflight() {
	confirmflight.click();
}

public void returnflight() {
	returnflight.click();
}

public void nothanks() {
	nothanks.click();
}





public void confirmreturnflight() {
	confirmreturnflight.click();
}
}


	









