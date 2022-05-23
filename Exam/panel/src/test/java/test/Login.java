package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login {
	@Test
	public static void Tset1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Logs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("page title:" + driver.getTitle());
	     Actions a=new Actions(driver);
	     a.moveToElement(driver.findElement(By.cssSelector("li[class='header__topBarIconList_profile-icon']"))).build().perform();
	     a.click(driver.findElement(By.xpath("//a[contains(@class,'login-link authentication_popup')]"))).build().perform();
	    
	     driver.findElement(By.cssSelector("input[class='email required input_authentication']")).sendKeys("mindtreemd@gmail.com",Keys.TAB,"mind00@123");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	     driver.findElement(By.id("ul_site_login")).click();
	    // a.moveToElement(driver.findElement(By.cssSelector("li[class='header__topBarIconList_profile-icon']"))).build().perform();
		 // driver.findElement(By.linkText("Profile")).click();
	}

}