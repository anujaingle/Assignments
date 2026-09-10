package SeleniumAssignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Assign2_FoodAutomation {

	public static void main(String[] args) {
		

		    

		    @BeforeMethod
		    public void setUp() {
		    	 WebDriver driver;
				    WebDriverWait wait;
		        driver = new ChromeDriver();

		        driver.manage().window().maximize();

		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		       
		        String url = "https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_4016c026-4a28-4037-a1c6-5bbc3d95fd14.html";
				// Go to site
		        driver.get(url);
		    }

		    @Test
		    public void foodOrderTest() {

		        FluentWait<WebDriver> wait;
				// 1. Wait for heading "Food Order Automation"
		        WebElement heading = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(
		                        By.xpath("//h1[normalize-space()='Food Order Automation']")
		                )
		        );

		        Assert.assertTrue(
		                heading.isDisplayed(),
		                "Food Order Automation heading is not displayed"
		        );

		        // 2. Wait for menu/category buttons to be visible
		        WebElement drink = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(
		                        By.xpath("//button[normalize-space()='Drink']")
		                )
		        );

		        Assert.assertTrue(
		                drink.isDisplayed(),
		                "Menu is not visible"
		        );

		        // 3. Click on category
		        // Example: Drink category
		        drink.click();

		        // 4. Add foodId to cart
		        //
		        // The exact foodId should be taken from the application's
		        // HTML/JavaScript. Example below assumes foodId = 1.
		        String foodId = "1";

		        WebElement foodItem = wait.until(
		                ExpectedConditions.elementToBeClickable(
		                        By.xpath("//*[@data-food-id='" + foodId + "']")
		                )
		        );

		        foodItem.click();

		        // 5. Wait for cart count to update
		        WebElement cart = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(
		                        By.xpath("//*[contains(normalize-space(), 'Cart')]")
		                )
		        );

		        wait.until(driver ->
		                cart.getText().contains("1")
		        );

		        Assert.assertTrue(
		                cart.getText().contains("1"),
		                "Cart count was not updated"
		        );

		        // 6. Click Confirm Order
		        WebElement confirmOrder = wait.until(
		                ExpectedConditions.elementToBeClickable(
		                        By.xpath("//button[normalize-space()='Confirm Order']")
		                )
		        );

		        confirmOrder.click();

		        // 7. Check if popup is displayed
		        WebElement popup = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(
		                        By.xpath("//*[contains(normalize-space(), 'Order Confirmed')]")
		                )
		        );

		        Assert.assertTrue(
		                popup.isDisplayed(),
		                "Order confirmation popup is not displayed"
		        );

		        // 8. Close popup
		        WebElement closeButton = wait.until(
		                ExpectedConditions.elementToBeClickable(
		                        By.xpath("//button[normalize-space()='Close']")
		                )
		        );

		        closeButton.click();

		        // Verify popup is closed
		        wait.until(
		                ExpectedConditions.invisibilityOf(popup)
		        );

		        System.out.println("Food Order Automation completed successfully.");
		    }

		    @AfterMethod
		    public void tearDown() {

		        Object driver;
				if (driver != null) {
		            ((WebDriver) driver).quit();
		        }
		    }
		}
