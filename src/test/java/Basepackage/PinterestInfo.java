package Basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class PinterestInfo {
	public WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get("https://in.pinterest.com/");
		driver.manage().window().maximize();
		

	}

}
