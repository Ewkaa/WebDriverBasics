package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import GL.WebDriverBasics.GoogleHomePage;


public class TestGoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.pl");
		
		GoogleHomePage gooPage = new GoogleHomePage(driver);
		
		gooPage.goToRandomPage();
		
		Thread.sleep(5000);
		
		gooPage.setSearchText("siemA");
		
		gooPage.pressSearchButton();
		
		Thread.sleep(5000);
		
		driver.close();
	}
	

}