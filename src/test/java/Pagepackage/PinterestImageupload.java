package Pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinterestImageupload {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"mweb-unauth-container\"]/div/div/div[1]/div/div[2]/div[2]/button/div/div")
	WebElement loginbutton;
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div[2]/div/div/div/div/div/div[4]/form/div[7]/button/div")
	WebElement login;
	@FindBy(xpath="//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[4]/div/a/div/div/span")
	WebElement create;
	@FindBy(xpath="//input[@id='storyboard-upload-input']")
	WebElement upimage;
	@FindBy(xpath="//input[@placeholder='Add a title']")
	WebElement title;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div/div/div[2]/div[4]/div[2]/div/button")
	WebElement publish;
	@FindBy(xpath="//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[6]/div[4]/div")
	WebElement profile;
	@FindBy(xpath="//*[@id=\"_created-profile-tab\"]")
	WebElement created;
	@FindBy(xpath="//button[@aria-label='Accounts and more options']")
	WebElement dropdown;
	@FindBy(xpath="//span[@title='Log out']")
	WebElement logout;
	public PinterestImageupload(WebDriver driver)
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
	public void createClick() throws InterruptedException
	{
		Thread.sleep(4000);
		create.click();
	}
	public void uploadImage() throws InterruptedException
	{
		Thread.sleep(4000);
		//upimage.click();
		upimage.sendKeys("C:\\Users\\HP\\Pictures\\keila.jpg");
	}
	public void addTitle() throws InterruptedException
	{
		Thread.sleep(4000);
		title.sendKeys("Hey! I'm keila the labrador");
	}
	public void publishClick() throws InterruptedException
	{
		Thread.sleep(4000);
		publish.click();
	}
	public void profileClick() throws InterruptedException
	{
		Thread.sleep(4000);
		profile.click();
	}
	public void createdClick() throws InterruptedException
	{
		Thread.sleep(4000);
		created.click();
	}
	public void scroll() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
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
