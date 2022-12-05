package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Maven_Sele_Test {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("http://www.bing.com");
	  Thread.sleep(3000);
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  //sample for commit
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
