package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGooglewithFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.withfirefox
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Projects\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.co.in");
		
		//enter a search term
		//click the wikipedia link
		
		driver.findElement(By.id("APjFqb")).sendKeys("Wallpaper" + Keys.ENTER);
		//driver.quit();
		
		
	}

}
