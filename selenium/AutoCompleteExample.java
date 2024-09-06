package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1.Interact with auto complete
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("r");
		
		Thread.sleep(4000);//explicit wait //implicit wait
		List<WebElement> optionslist = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(optionslist.size());//check the line execute before the previuos line
		for (WebElement webElement : optionslist) {
			if(webElement.getText().equals("Erlang")) {
				webElement.click();
				System.out.println("selecting" +webElement.getText());
				break;
			}
		}
	}

}
