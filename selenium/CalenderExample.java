package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interact with calender
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		WebElement calender = driver.findElement(By.id("datetimepicker1"));
		calender.click();
		WebElement nextbutton = driver.findElement(By.xpath("//*[name()='svg' and @version='1.1']//following::*[name()='svg' and @version='1.1'][1]"));
		nextbutton.click();
		
		WebElement dategiven = driver.findElement(By.xpath("//span[@class='flatpickr-day' and text()='16']"));
		dategiven.click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	}

}
