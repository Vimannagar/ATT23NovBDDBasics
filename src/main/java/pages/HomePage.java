package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;

	private WebDriverWait wait;

	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;

	@FindBy(xpath = "//img[@alt='BISS']/parent::a")
	private WebElement dealSection;
	@FindBy(xpath = "//*[@class='a-list-item']//*[text()='Bosch']")
	private WebElement groceryText;

	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public String getTitleOfPage() {
		String titleOfPage = driver.getTitle();

		return titleOfPage;
	}

	public boolean isCartIconDisplayed() {

		boolean isDisplaying = cartIcon.isDisplayed();

		return isDisplaying;

	}

	public void checkoutDealsSection() {
		wait.until(ExpectedConditions.visibilityOf(dealSection));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", dealSection);
	}

	public boolean helmetSection() {
		wait.until(ExpectedConditions.visibilityOf(groceryText));

		boolean isDislaying = groceryText.isDisplayed();

		return isDislaying;
	}

}
