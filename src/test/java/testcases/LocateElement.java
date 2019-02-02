package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;

public class LocateElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://wikipedia.pl/");
		
		// -----------------------------------------------------------------------------------------------
		// web driver supports 8 strategies to locate web elements:
		// -----------------------------------------------------------------------------------------------
		// id
		driver.findElement(By.id("searchButton")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// name
		driver.findElement(By.name("go")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// class
		driver.findElement(By.className("searchButton")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// xpath
		driver.findElement(By.xpath(".//*[@id='searchButton']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// css selector
		driver.findElement(By.cssSelector("#searchButton")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// linkText
		driver.findElement(By.linkText("Dyskusja")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// partial link text
		driver.findElement(By.partialLinkText("Tekst")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// tag name
		System.out.println(driver.findElement(By.tagName("h1")).getAttribute("class").toString());
				
		Thread.sleep(1000);
		
		// -----------------------------------------------------------------------------------------------
		// how to handle multiple web elements - display all languages
		// -----------------------------------------------------------------------------------------------
		List<WebElement> languages =  driver.findElements(By.className("interlanguage-link-target"));
		for(WebElement l : languages)
		{
			System.out.println(l.getAttribute("title").toString());
		}
		
		// -----------------------------------------------------------------------------------------------
		// how to find first, last, nth element from group of similar elements
		// -----------------------------------------------------------------------------------------------
		WebElement firstLanguage1 = driver.findElements(By.className("interlanguage-link-target")).get(0);
/*		WebElement firstLanguage2 =  driver.findElement(By.xpath(".//*[@id='p-lang']/div/ul/li[1]/a"));
		WebElement firstLanguage3 =  driver.findElement(By.cssSelector("#p-lang ul li:first-child a"));*/
		
		System.out.println(firstLanguage1.getAttribute("title").toString());						
		
		Thread.sleep(1000);
		
		driver.close();

	}

}