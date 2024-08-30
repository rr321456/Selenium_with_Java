package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Interact with ToolTip
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		
		WebElement name = driver.findElement(By.id("firstname"));
		String tooltiptext = name.getAttribute("title");
		System.out.println("text in tooltip:" +tooltiptext);
	}

}
