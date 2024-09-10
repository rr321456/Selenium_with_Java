package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Interact with sortable
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/sortable");
		
		WebElement fromelement = driver.findElement(By.id("sample-box1"));
		WebElement toelement = driver.findElement(By.id("sample-box1"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromelement).moveToElement(toelement).release(toelement).build().perform();
	}

}
