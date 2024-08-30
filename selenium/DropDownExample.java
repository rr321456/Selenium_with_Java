package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interact with drop down
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		//Select fruit using index
		WebElement dropdown1 = driver.findElement(By.id("fruits"));
		
		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		
		//Select fruit using value
		select.selectByValue("1");
		
		//Select fruit using text
		select.selectByVisibleText("Pine Apple");
		
		//Get the no. of dropdown option
		List<WebElement> listofoption = select.getOptions();
		int size = listofoption.size();
		System.out.println("no. of element in dropdown" +size);
		
		//Select fruit using sndkeys
		dropdown1.sendKeys("Banana");
		
		//Select multiple elements
		WebElement multiselect = driver.findElement(By.id("superheros"));
		Select multiselectbox = new Select(multiselect);
		
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
	}

}
