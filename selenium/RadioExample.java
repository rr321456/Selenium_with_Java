package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Interact with radio button
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		//find which radio button is selected
		WebElement Fooradio = driver.findElement(By.id("foo"));
		
		//find the button selected or not?
		WebElement checkradio = driver.findElement(By.id("no"));
		boolean status1 = checkradio.isSelected();
		boolean status2 = Fooradio.isSelected();
		System.out.println("status 1:" +status1+ "status 2:" +status2);
		
		//select a radio button
		WebElement selectradio = driver.findElement(By.id("going"));
		selectradio.click();
	}

}
