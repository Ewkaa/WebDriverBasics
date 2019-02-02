package GL.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryWikipediaHomePage {

	WebDriver driver;
	
	@FindBy(css = "#n-randompage a")
	WebElement randomPage;
	
	@FindBy(id = "searchInput")
	WebElement searchTextBox;
	
	@FindBy(className = "searchButton")
	WebElement searchButton;
	
	public PageFactoryWikipediaHomePage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void goToRandomPage() {
		randomPage.click();
	}
	
	public void setSearchText(String text) {
		searchTextBox.sendKeys(text);
	}	
		
	public void pressSearchButton() {
		searchButton.click();
	}
	
}
