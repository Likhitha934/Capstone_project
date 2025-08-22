package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertss {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	}
	private WebDriver driver;
	private Object actualurl;
	private String expectedurl;
  @Test
  public void title() {
	  String expectedtitle = "Selenium dev";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title Validation Failed");
	  System.out.println("Expected Title:"+expectedtitle);
	  System.out.println("Actual Title:"+actualtitle);
	  
	  
  }
  @Test
  public void url() {
	  String expectedtitle = "https://www.selenium.dev/";
	  String actualtitle = driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, expectedurl,"URL validation failed");
	  System.out.println("Expected URL:"+expectedurl);
	  System.out.println("Actual URL:"+actualurl);
	  
	  
}
  @Test
  public void afterClass()
  {
	  WebDriver driver = null;
	  driver.close();
  }
}
