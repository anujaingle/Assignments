package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1_AutomationPracticeForm {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_997951c3-ea02-4bd1-94eb-4dfb62b41407.html");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    

        // Enter Name
        driver.findElement(By.id("userName")).sendKeys("Shreya sharma");
        Thread.sleep(3000);
        // Enter City
        driver.findElement(By.id("city")).sendKeys("mumbai");
        Thread.sleep(3000);
    	driver.findElements(By.name("gender")).get(1).click();
		Thread.sleep(3000);
		
		 List<WebElement> skills = driver.findElements(By.name("skills"));
	        for(WebElement skill : skills)
	        {
	            skill.click();
	        }

	        // Click submit
	        driver.findElement(By.id("submitButton")).click();

	        Thread.sleep(3000);

	       
	}

}
