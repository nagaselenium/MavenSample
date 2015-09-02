package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown_Count {
	public WebDriver driver;
  @Test
  public void testFirefox_test() throws Exception {
	 //navigate to google application
	//in webdriver http:// is mandatory, if you dont give http:// then webdriver can not understand /recognize it as web application
	  driver.get("https://www.facebook.com/");
	 WebElement dd=driver.findElement(By.name("birthday_month"));
	 List<WebElement> values=dd.findElements(By.tagName("option"));
	 System.out.println("Number of elements in DD : "+values.size());
	 for (int i = 0; i < values.size(); i++) {
		System.out.println("Values in DD are : "+values.get(i).getText());
	}
	 Thread.sleep(2000);
	 
  }
  @BeforeClass
  public void beforeClass() {
	  //instantiate browser
	  driver = new FirefoxDriver();  //will launch firefox browser
	  //global wait
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  //close browser
	  driver.quit();
  }

}
