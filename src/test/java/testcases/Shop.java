package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class Shop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		
		driver.get("http://www.auto.pl/");
		
		// select from list - use select class
		WebElement markaDDL = driver.findElement(By.id("z4z_in_1"));
		new Select(markaDDL).selectByVisibleText("BMW");
		Thread.sleep(500);
		
		WebElement modelDDL = driver.findElement(By.id("zfn_in_1"));
		new Select(modelDDL).selectByVisibleText("M5");
		Thread.sleep(500);
		
		WebElement nadwozieDDL = driver.findElement(By.id("zg9"));
		new Select(nadwozieDDL).selectByVisibleText("sedan (limuzyna)");
		Thread.sleep(500);
		
		driver.findElement(By.id("zb7_do")).sendKeys("150000");
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("button.form-control")).click();
		
		// add ads
		driver.findElement(By.cssSelector("li.btn")).click();
		WebElement markaDoDDL = driver.findElement(By.id("z4z"));
		new Select(markaDoDDL).selectByVisibleText("BMW");
		Thread.sleep(500);
		
		WebElement modelDoDDL = driver.findElement(By.id("zfn"));
		new Select(modelDoDDL).selectByVisibleText("M5");
		Thread.sleep(500);
		
		WebElement pojemnoscDDL = driver.findElement(By.id("zbd"));
		new Select(pojemnoscDDL).selectByVisibleText("2.0");
		Thread.sleep(500);
		
		WebElement paliwoDDL = driver.findElement(By.id("zb5"));
		new Select(paliwoDDL).selectByVisibleText("benzyna");
		Thread.sleep(500);
		
		WebElement drzwiDDL = driver.findElement(By.id("zbg"));
		new Select(drzwiDDL).selectByVisibleText("4/5");
		Thread.sleep(500);
		
		WebElement miejscaDDL = driver.findElement(By.id("zbf"));
		new Select(miejscaDDL).selectByVisibleText("5");
		Thread.sleep(500);
		
		WebElement nadwozieDoDDL = driver.findElement(By.id("zg9"));
		new Select(nadwozieDoDDL).selectByVisibleText("sedan (limuzyna)");
		Thread.sleep(500);
		
		WebElement skrzyniaDDL = driver.findElement(By.id("zb6"));
		new Select(skrzyniaDDL).selectByVisibleText("ręczna/manualna");
		Thread.sleep(500);
		
		WebElement rocznikDDL = driver.findElement(By.id("zbb"));
		new Select(rocznikDDL).selectByVisibleText("2015");
		Thread.sleep(500);
		
		WebElement napedDDL = driver.findElement(By.id("zb4"));
		new Select(napedDDL).selectByVisibleText("tył");
		Thread.sleep(500);
		
		driver.findElement(By.id("zbc")).sendKeys("100000");
		
		WebElement kolorDDL = driver.findElement(By.id("zk5"));
		new Select(kolorDDL).selectByVisibleText("czarny");
		Thread.sleep(500);
		
		WebElement zarejDDL = driver.findElement(By.id("zck"));
		new Select(zarejDDL).selectByVisibleText("zarejestrowany");
		Thread.sleep(500);
		
		WebElement pochDDL = driver.findElement(By.id("zb1"));
		new Select(pochDDL).selectByVisibleText("krajowy");
		Thread.sleep(500);
		
		WebElement uszkoDDL = driver.findElement(By.id("zv8"));
		new Select(uszkoDDL).selectByVisibleText("Nie");
		Thread.sleep(500);
		
		driver.findElement(By.id("zb7")).sendKeys("150000");
		driver.findElement(By.id("z25")).sendKeys("100000123");
		
		WebElement regDDL = driver.findElement(By.id("zr"));
		new Select(regDDL).selectByVisibleText("pomorskie");
		Thread.sleep(500);
		
		driver.findElement(By.id("z23")).sendKeys("słupsk");
		
		driver.findElement(By.id("z28")).sendKeys("90-250");
		
		driver.findElement(By.id("zy")).sendKeys("abc@123.com");
		
		WebElement skadDDL = driver.findElement(By.id("zkf"));
		new Select(skadDDL).selectByVisibleText("inne");
		Thread.sleep(500);
		
		driver.findElement(By.id("ztx")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".btn-success")).click();
		// go to Contact us page - click
		
		driver.findElement(By.cssSelector("div.small:nth-child(4) > div:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
		
			
		//Thread.sleep(4000);
		
		// type text into text fields - sendKeys
		driver.findElement(By.id("teamt")).sendKeys("test");
		driver.findElement(By.id("tresc")).sendKeys("test message");
		driver.findElement(By.id("podpis")).sendKeys("123");
		driver.findElement(By.id("from")).sendKeys("abc@123.com");
		
		// click send - click
		driver.findElement(By.cssSelector("div.text-right:nth-child(6) > button:nth-child(1)")).click();
		
		// get text message - getText
		//System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		
		Thread.sleep(4000);
		
		driver.close();
	}

}