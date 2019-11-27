package Expedia.expedia.piit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Exeexpedia {
	
	static WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  Flight tab=new Flight(driver);
	  Thread.sleep(3000);
	  tab.Fly();
	  tab.from("Richmond");
	  Thread.sleep(3000);
	  tab.to("New York");
	  tab.dep();
	  Thread.sleep(3000);
	  tab.date();
	  tab.retu();
	  tab.reda();
	  tab.sear();
	  Thread.sleep(8000);
	  
	Selectflight sltflight=new Selectflight(driver);
	sltflight.flight();
	
	Thread.sleep(4000);
	  
	sltflight.confirmflight();
	
	Thread.sleep(8000);
	sltflight.returnflight();
	
	Thread.sleep(7000);
	
	sltflight.confirmreturnflight();
	Thread.sleep(7000);
	
	sltflight.nothanks();
	
	String a=driver.getWindowHandle();
	System.out.println(a);
	
	Set<String> newpage=driver.getWindowHandles();
	System.out.println(newpage);
	
	for (String windowbrowser:newpage) {
		if (windowbrowser!=a) {
			driver.switchTo().window(windowbrowser);
		}
	}
	
	driver.navigate().refresh();
	
	booking bk=new booking(driver);
	bk.bookbutton();
	
	
	fillpage fillpg=new fillpage(driver);
	Thread.sleep(5000);
	fillpg.firstname("hasina");
	Thread.sleep(3000);
	fillpg.lastname("sikder");
	
	fillpg.phonenumber("8043224501");
	
	fillpg.female();
	
	fillpg.month("JUN");
	
	
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hasin\\eclipse-workspace\\Automation_Aps_code\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	     driver.navigate().to("https://www.expedia.com");
	     driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
