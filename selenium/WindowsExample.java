package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Interact with windows
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		String oldwindow = driver.getWindowHandle();//Stores Current window identity
		
		//click the homepage and click new window
		WebElement firstbutton = driver.findElement(By.id("home"));
		firstbutton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		
		WebElement editbox = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		editbox.click();
		driver.close();
		
		//move the control to parent window
		driver.switchTo().window(oldwindow);
		
		//find the no. of opened windows
		WebElement openmultiple = driver.findElement(By.id("multi"));
		openmultiple.click();
		int numofwindows = driver.getWindowHandles().size();
		System.out.println("number of windows opened" +numofwindows);
		
		//close the multiple child windows except parent window
		openmultiple.click();
		Set<String> newwindowhandles = driver.getWindowHandles();
		for (String allwindows : newwindowhandles) {
			if(!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
		}
	}
}
