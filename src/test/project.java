package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class project {

	static WebDriver driver;
	@BeforeMethod
	public static void projectsetup() {
		
	driver = new ChromeDriver();
	driver.get("https://offer.buythepestdefence.com/offer/1/checkout-now-v1.php");
      
   
	}

     @Test
     public static void suggestiveDropdown() throws InterruptedException {
    	 
    	driver.findElement(By.xpath("//input[@placeholder='Your Address1']")).sendKeys("650");
    	
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8));
    	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='pac-item'])[2]"))).click();	
    	 
     }
     
     
     






}
