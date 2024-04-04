package Testpackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Basepackage.PinterestInfo;
import Pagepackage.PinterestImageupload;
import Pagepackage.PinterestMessage;
import Pagepackage.PinterestSearch;
import Pagepackage.PinterestSignup;
import utilities.PinterestUtilities;

public class PinterestTest extends PinterestInfo {
	@Test(priority=1)
	public void signinTest() throws InterruptedException, IOException
	{
		PinterestSignup ob=new PinterestSignup(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		ob.signupClick();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
		ob.emailEnter();
		ob.passwordEnter();
		ob.birthdayEnter();
		ob.signinClick();
		ob.profileClick();
		ob.editProfile();
		ob.editAbout();
		//ob.editPronouns();
		ob.saveProfile();
		ob.profileClick();
		ob.pinterstScreenshot();
		ob.profileDropdown();
		ob.logoutClick();
		}

	@Test(priority=2)
	public void verifyLogin() throws InterruptedException
	{
		PinterestSearch sh=new PinterestSearch(driver);
		String xl="C:\\Users\\HP\\Desktop\\gdrive.xlsx";
		String sheet="Sheet1";
		int rowcount=PinterestUtilities.getRowCount(xl,sheet);
		
		sh.login();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//Thread.sleep(2000);
		for(int i=1;i<=rowcount;i++)
		{
			String uname=PinterestUtilities.getCellValue(xl, sheet, i, 0);
			System.out.println("username--->"+uname);
			String pwd=PinterestUtilities.getCellValue(xl, sheet, i, 1);
			System.out.println("password---->"+pwd);
			//driver.findElement(By.name("id")).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
			sh.usernameClick(uname,pwd);
			sh.loginButton();
			sh.searchBar();
			sh.ClickPicture();
			sh.savePicture();
			sh.clickProfile();
			sh.scroll();
			sh.gotoHome();
			sh.profileDropdown();
			sh.logoutClick();
	
		}
}
	@Test(priority=3)
	public void verifyImageupload() throws InterruptedException
	{
		PinterestImageupload ig=new PinterestImageupload(driver);
		String xl="C:\\Users\\HP\\Desktop\\gdrive.xlsx";
		String sheet="Sheet1";
		int rowcount=PinterestUtilities.getRowCount(xl,sheet);
		
		ig.login();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//Thread.sleep(2000);
		for(int i=1;i<=rowcount;i++)
		{
			String uname=PinterestUtilities.getCellValue(xl, sheet, i, 0);
			System.out.println("username--->"+uname);
			String pwd=PinterestUtilities.getCellValue(xl, sheet, i, 1);
			System.out.println("password---->"+pwd);
			//driver.findElement(By.name("id")).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
			ig.usernameClick(uname,pwd);
			ig.loginButton();
			ig.createClick();
			ig.uploadImage();
			ig.addTitle();
			ig.publishClick();
			ig.profileClick();
			ig.createdClick();
			ig.scroll();
			ig.profileDropdown();
			ig.logoutClick();
		
		}
	}
	@Test(priority=4)
	public void verifyMessage() throws InterruptedException
	{
		PinterestMessage mg=new PinterestMessage(driver);
		mg.login();
		mg.usernameClick();
		mg.loginButton();
		mg.messageClick();
		mg.profileView();
		mg.profileClick();
		mg.followingClick();
		mg.closefollowingTab();
		mg.profileDropdown();
		mg.logoutClick();
		
	}
}
