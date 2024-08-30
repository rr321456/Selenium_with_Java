package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Interact with text box
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		WebElement emailbox = driver.findElement(By.id("fullName"));
		emailbox.sendKeys("abc@gmail.com");
		
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'join\']"));
		appendbox.sendKeys("uvwxyz");
		
		WebElement gettexbox = driver.findElement(By.id("getMe"));
		String value1 = gettexbox.getAttribute("value");
		System.out.println(value1);
		
		WebElement clearbox = driver.findElement(By.id("clearMe"));
		clearbox.clear();
		
		WebElement disabledbox = driver.findElement(By.id("noEdit"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled); 
	}

}
