package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://pl.wikipedia.org");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#n-randompage a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("searchInput")).sendKeys("selenium");
		driver.findElement(By.className("searchButton")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
