package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Interact with alert
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//click the button to display alertbox & close the alert box
		WebElement alertbox = driver.findElement(By.id("accept"));
		alertbox.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//click the button to display confirmbox
		WebElement confirmbutton = driver.findElement(By.id("confirm"));
		confirmbutton.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		//click the button to display and type prompt box
		WebElement promptbox = driver.findElement(By.id("prompt"));
		promptbox.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("good evening");
		promptalert.accept();

	}

}
