package Pagepackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PinterestMessage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"mweb-unauth-container\"]/div/div/div[1]/div/div[2]/div[2]/button/div/div")
	WebElement loginbutton;
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div[2]/div/div/div/div/div/div[4]/form/div[7]/button/div")
	WebElement login;
	@FindBy(xpath="//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[6]/div[3]/div/div/div/div/div")
	WebElement message;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/a")
    WebElement viewprofile;
	@FindBy(xpath="//div[@data-test-id='header-profile']")
	WebElement profile;
	@FindBy(xpath="//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/div[4]/div/div/div/span")
	WebElement following;
	@FindBy(xpath="//button[@aria-label='Close modal']")
	WebElement closefollowing;
	@FindBy(xpath="//button[@aria-label='Accounts and more options']")
	WebElement dropdown;
	@FindBy(xpath="//span[@title='Log out']")
	WebElement logout;
	
	public PinterestMessage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login() throws InterruptedException
	{
		Thread.sleep(4000);
		loginbutton.click();
	}
	public void usernameClick() throws InterruptedException
	{
		Thread.sleep(4000);
		username.sendKeys("anakha.rajendran07@gmail.com");
		password.sendKeys("Asd123@");
	}
	public void loginButton() throws InterruptedException
	{
		Thread.sleep(4000);
		login.click();
	}
	public void messageClick() throws InterruptedException
	{
		Thread.sleep(5000);
		message.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[5]/div/div/ul/div[1]/div/div/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"messageDraft\"]")).sendKeys("hi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/div/div/div/div[2]/button")).click();
		
	}
public void profileView() throws InterruptedException
{
	Thread.sleep(3000);
	viewprofile.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/div[4]/div/div/div[2]/div/div[2]/div/div/button")).click();
}
public void profileClick() throws InterruptedException
{
	Thread.sleep(4000);
	profile.click();
}
public void followingClick() throws InterruptedException
{
	Thread.sleep(4000);
	//driver.navigate().refresh();
	following.click();
}
public void closefollowingTab() throws InterruptedException
{
	Thread.sleep(3000);
	closefollowing.click();
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
