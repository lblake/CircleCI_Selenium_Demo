package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
	public ChromeDriver driver;
	
	@BeforeTest
	public void beforeClass() {
		  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
		
	}
    @Test
    public void openMyBlog() {
    	driver.get("https://www.google.com/");
    }
  


    @AfterTest
  public void afterClass() {
	  driver.close();
  }

}