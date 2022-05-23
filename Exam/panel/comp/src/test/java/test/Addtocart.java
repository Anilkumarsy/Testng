package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addtocart {
	@Test
	public static void addToCart() {
		System.setProperty("webdriver.chrome.driver", "C:\\Logs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("page title:" + driver.getTitle());
		driver.findElement(By.cssSelector("a[href='/sofa-set?src=explore_categories']")).click();
		driver.findElement(By.cssSelector("img[src='https://www.ulcdn.net/images/taxon_images/taxon/8078/taxon_col_3/All-sofas.jpg']")).click();
		System.out.println("Page Title"+driver.getTitle());
		Set<String> id=driver.getWindowHandles();
		Iterator<String> abc=id.iterator();
		String x=abc.next();
		String z=abc.next();
		driver.switchTo().window(z);
		System.out.println("Page Title"+driver.getTitle());
		driver.findElement(By.cssSelector("a[data-id='72755']")).click();
		WebElement var=driver.findElement(By.xpath("//div[contains(@class,'price final')]"));
		System.out.println(var.getText());
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//a[contains(@class,'continueshop')]")).click();
	}
}
