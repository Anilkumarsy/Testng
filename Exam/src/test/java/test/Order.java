package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order {
	@Test
	public static void Tset2() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Logs\\chromedriver.exe");  
	     WebDriver driver=new ChromeDriver();  
	     driver.get("https://www.urbanladder.com/"); 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     System.out.println("Page title is:"+driver.getTitle());	
	     driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Dining");
	     driver.findElement(By.cssSelector(("span[class='search-icon icofont-search']"))).click();
	     driver.findElement(By.xpath("//a[contains(@data-id,'107595')]")).click();
	     System.out.println("Page Title:"+driver.getTitle());
	     Set<String>wid=driver.getWindowHandles();
	     Iterator<String> ab=wid.iterator();
	     String a=ab.next();
	     String b=ab.next();
	     driver.switchTo().window(b);
	     WebElement x= driver.findElement(By.xpath("//div[contains(@class,'price discounted-price')]"));
	     System.out.println(x.getText());
	     driver.findElement(By.id("add-to-cart-button")).click();
	     driver.findElement(By.id("checkout-link")).click();
	     System.out.println("Page Title:"+driver.getTitle());
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//input[contains(@id,'order_email')]")).sendKeys("mindtree@gmail.com");
	     driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys("590001");
	     driver.findElement(By.id("order_ship_address_attributes_address1")).sendKeys("Whitefield Bangalore");
	     driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys("mind");
	     driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys("tree");
	     driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys("8767892345");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[contains(@id,'address-form-submit')]")).click();
	     WebElement z= driver.findElement(By.xpath("//*[@id=\"checkout-summary\"]/div/ul[2]/li[4]/span"));
	     System.out.println(z.getText());
	     driver.findElement(By.xpath("//input[contains(@value,'Place Order')]")).click();
	     //driver.findElement(By.id("modal-close")).click();
	    // driver.findElement(By.xpath("//div[contains(@class,'svelte-ll8dmg')]")).click();
	     
	     
	}	
}
