package Expedia.expedia.piit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booking {

	public static WebDriver driver;

	public booking(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	
	
	
	@FindBy (id="bookButton")
	WebElement bookbutton;

public void bookbutton() {
	bookbutton.click();
}
}
