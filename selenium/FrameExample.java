package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Interact with frame 
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		//Interact with textbox inside the frame
		driver.switchTo().frame(0);//frame 1
		WebElement button1 = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input"));
		button1.sendKeys("hello");
		driver.switchTo().defaultContent();
		
		//Interact with textbox in nested frame
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		WebElement button2 = driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input"));
		button2.sendKeys("abc@gmail.com");
		driver.switchTo().defaultContent();
		
		//Find total no. of frames
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int size = totalframes.size();
		System.out.println(size);
		
	}

}
