package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		//Interact with Upload file from pc
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/file");
		
		WebElement uploadbutton = driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[1]/div/div/label/span/span[2]"));
		uploadbutton.click();
		
		Thread.sleep(3000);
		String file = "C:\\Users\\Dark World\\Downloads\\sample.xlsx";
		StringSelection selection = new StringSelection(file);//make the string into transferable string
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);//paste file path in clipboard
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
	}

}
