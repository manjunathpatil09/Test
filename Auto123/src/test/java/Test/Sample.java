package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample 
{
	
	  @Test 
	  public void tes()
	  { 
		  WebDriverManager.chromedriver().setup(); WebDriver
		  driver=new ChromeDriver();
		  driver.close();
	  }
	 
	@Test
	public void test()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");	
	}		

}
