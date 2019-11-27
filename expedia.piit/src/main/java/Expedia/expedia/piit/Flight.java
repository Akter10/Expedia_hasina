package Expedia.expedia.piit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight {
	public static WebDriver driver;

	public Flight (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flighttab;
	
	@FindBy(xpath="//input[@id='flight-origin-hp-flight']")
	WebElement Flyingfrom;
	@FindBy(xpath="//input[@id='flight-destination-hp-flight']")
	WebElement flyingTo;
	@FindBy(id="flight-departing-hp-flight")
	WebElement depart;
	@FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/fieldset[2]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[5]/td[7]/button")
	WebElement datefrom;
	@FindBy(id="flight-returning-hp-flight")
	WebElement returning;
	@FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/fieldset[2]/div/div[3]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/button")
	WebElement redate;
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	WebElement search;
	
	//@FindBy (xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit'] ")
	//WebElement search;
	
	
	public void Fly() {
		flighttab.click();
	}
   public void from(String city) {
	Flyingfrom.sendKeys("Richmond");
}
   public void to(String city) {
	flyingTo.sendKeys("New York");}
 
	public void dep() {
		depart.click();
		
	}
	public void date() {
		datefrom.click();
	}
	public void retu() {
		returning.click();
	}
	public void reda() {
		redate.click();
	}
	 public void sear() {
	  search.click();}
}




