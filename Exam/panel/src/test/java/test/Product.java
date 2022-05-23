package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Product {
	@Test
	public static void Tset3() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Logs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("page title:" + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@title,'Track Order')]")).click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("page title:" + driver.getTitle());
		driver.findElement(By.id("ip_379403698")).sendKeys("101");
		driver.findElement(By.id("ip_394711104")).sendKeys("8748064286");
		driver.findElement(By.xpath("//button[contains(@class,'_3Haew _1fVSi action-button _1njbS _1XfDi _1tgY9')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'_3Haew _1fVSi action-button _1njbS _1XfDi _3J6Eb _1tgY9')]")).click();
		Thread.sleep(2000);
		System.out.println("page title:" + driver.getTitle());
	}

}
