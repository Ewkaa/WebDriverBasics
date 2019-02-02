package GL.WebDriverBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
	
	WebDriver driver;
	
	By randomPage = By.cssSelector("#n-randompage a");
	By searchTextBox = By.name("q");
	By searchButton = By.name("btnK");
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToRandomPage() {
		driver.findElement(randomPage).click();
	}
	
	public void setSearchText(String text) {
		driver.findElement(searchTextBox).sendKeys(text);
	}	
		
	public void pressSearchButton() {
		driver.findElement(searchButton).click();
	}
	
}
