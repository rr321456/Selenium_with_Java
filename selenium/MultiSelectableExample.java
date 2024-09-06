package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Interact with multiSelectable 
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		
		//select first 3 elements
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']"));
		int listsize = selectable.size();
		System.out.println(listsize);
		Actions actions = new Actions(driver);
		//keydown used for pressing the key
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1))
		.click(selectable.get(2)).build().perform();
	}

}
