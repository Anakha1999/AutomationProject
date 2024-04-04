package Pagepackage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PinterestSearch {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"mweb-unauth-container\"]/div/div/div[1]/div/div[2]/div[2]/button/div/div")
	WebElement loginbutton;
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div[2]/div/div/div/div/div/div[4]/form/div[7]/button/div")
	WebElement login;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/a/div/div[1]/div/div/div/div/div/img")
	WebElement image;
	@FindBy(xpath="//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/button/div/div")
	WebElement save;
	@FindBy(xpath="//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/div/div[1]/a/div/div")
	WebElement profile;
	@FindBy(xpath="//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[2]/a/div/div/span")
	WebElement home;
	@FindBy(xpath="//button[@aria-label='Accounts and more options']")
	WebElement dropdown;
	@FindBy(xpath="//span[@title='Log out']")
	WebElement logout;
	
	
	public PinterestSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login()
	{
		loginbutton.click();
	}
	public void usernameClick(String uname,String pwd)
	{

		username.sendKeys(uname);
		password.sendKeys(pwd);
	}
	public void loginButton()
	{
		login.click();
	}

	public void searchBar() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("cars");
		search.sendKeys(Keys.ENTER);
		
	}
	public void ClickPicture() throws InterruptedException
	{
		Thread.sleep(4000);
		image.click();
	}
	public void savePicture() throws InterruptedException
	{
		Thread.sleep(4000);
		save.click();
	}
	public void clickProfile() throws InterruptedException
	{
		Thread.sleep(4000);
		profile.click();
	}
	public void scroll() throws InterruptedException
	{
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void gotoHome() throws InterruptedException
	{
		Thread.sleep(4000);
		home.click();
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


