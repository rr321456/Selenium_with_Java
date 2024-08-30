package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Interact with button
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Get the xy position of the button
		WebElement getpositionButton = driver.findElement(By.id("position"));
		
	    Point xypoint = getpositionButton.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		
		System.out.println("X value is:"+ xvalue + "Y value is:" +yvalue);
		
		//Find the color of the button
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Button color is"+color);
		
		//Find the height & width of the Button
		WebElement sizeButton = driver.findElement(By.id("property"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is: " + height + "Width" + width);
		
		//Go to Home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();              

	}

}
