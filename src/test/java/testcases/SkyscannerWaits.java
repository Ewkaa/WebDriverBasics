package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyscannerWaits {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skyscanner.pl/");
		
		driver.findElement(By.id("origin-fsc-search")).sendKeys("Warszawa");
		driver.findElement(By.id("destination-fsc-search")).sendKeys("Berlin");
		driver.findElement(By.className("bpk-button-2YQI1")).click();
		
		Thread.sleep(1000);
		
		WebElement flight = driver.findElement(By.cssSelector("div.day-list-container li"));
		//WebElement flight = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.day-list-container li")));
		flight.click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
