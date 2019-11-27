package Expedia.expedia.piit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fillpage {

	
	public static WebDriver driver;

	public fillpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}

@FindBy(id="firstname[0]")
WebElement firstname;

@FindBy(id="lastname[0]")
WebElement lastname;

@FindBy(id="phone-number[0]")
WebElement phonenumber;

@FindBy(xpath="/html/body/div[6]/div[1]/div[11]/section[2]/article[1]/form/fieldset/fieldset/div/fieldset[2]/label[2]")
WebElement female;

@FindBy(id="date_of_birth_month0")
WebElement month;




public void firstname(String fstname) {
	firstname.sendKeys(fstname);
}
public void lastname(String lstname) {
	lastname.sendKeys(lstname);
}

public void phonenumber(String phnumber) {
	phonenumber.sendKeys(phnumber);
}
 public void female() {
	 female.click();
 }

public void month(String mon) {
	month.sendKeys(mon);
}
}
