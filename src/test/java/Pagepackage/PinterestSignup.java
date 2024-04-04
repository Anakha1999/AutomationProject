package Pagepackage;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinterestSignup {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"mweb-unauth-container\"]/div/div/div[1]/div/div[2]/div[3]/button/div/div")
	WebElement signup;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"birthdate\"]")
	WebElement birthday;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div[2]/div/div/div/div/div[1]/div[5]/div/div[1]/form/div[8]/button/div")
	WebElement signin;
	@FindBy(xpath="//div[@data-test-id='header-profile']")
	WebElement profile;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/div[5]/div/div/div[2]/div/div/div/button")
	WebElement editprofile;
	@FindBy(xpath="//textarea[@name='about']")
	WebElement about;
//	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div[5]/div/span/div[1]/div[2]/div/div/div/svg")
//	WebElement pronouns;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/button")
	WebElement save;
	@FindBy(xpath="//button[@aria-label='Accounts and more options']")
	WebElement dropdown;
	@FindBy(xpath="//span[@title='Log out']")
	WebElement logout;
	

	public PinterestSignup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signupClick() throws InterruptedException
	{
		Thread.sleep(3000);
		signup.click();
	}
	public void emailEnter() 
	{
		
		email.sendKeys("anakha.rajendran07@gmail.com");
	}
	public void passwordEnter()
	{
		password.sendKeys("Asd123@");
	}
	public void birthdayEnter()
	{
		birthday.sendKeys("14081999");
		
	}
	public void signinClick() throws InterruptedException
	{
		Thread.sleep(2000);
		signin.click();
	}
	public void profileClick() throws InterruptedException
	{
		Thread.sleep(4000);
		profile.click();
	}
	public void editProfile() throws InterruptedException
	{
		Thread.sleep(4000);
		editprofile.click();
	}
	public void editAbout() throws InterruptedException
	{
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",about);
		about.clear();
		about.sendKeys("hey there, this is my Pinterest account");
	}
//	public void editPronouns() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		pronouns.click();
//		WebElement ele=driver.findElement(By.xpath("//span[@title='she/her']"));
//		ele.click();
//	}
	public void saveProfile() throws InterruptedException
	{
		Thread.sleep(3000);
		save.click();
	}
	public void pinterstScreenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://Anakha Paroor/pinterest.png"));
		File src1=profile.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./screenshot/PinterestProfile.png"));
	}
	public void profileDropdown() throws InterruptedException
	{
		Thread.sleep(3000);
		dropdown.click();
	}
	public void logoutClick() throws InterruptedException
	{
		Thread.sleep(4000);
		logout.click();
	}
	
}
