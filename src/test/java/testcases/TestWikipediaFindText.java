package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import GL.WebDriverBasics.WikipediaHomePage;


public class TestWikipediaFindText {
	
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://pl.wikipedia.org");
		
		WikipediaHomePage wikiPage = new WikipediaHomePage(driver);
		
		wikiPage.goToRandomPage();
		
		Thread.sleep(5000);
		
		wikiPage.setSearchText("selenium");
		
		wikiPage.pressSearchButton();
		
		Thread.sleep(5000);
		
		driver.close();
	}
	

}
