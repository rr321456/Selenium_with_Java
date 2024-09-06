package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1.Interact with file download
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/file");
		
		//download file 
		WebElement downloadlink = driver.findElement(By.linkText("Download Excel"));
		downloadlink.click();
		Thread.sleep(4000);
		
		//check the file downloaded
		File filelocation = new File("C:\\Users\\Dark World\\Downloads");
		File[]  totalfiles = filelocation.listFiles();
		
		for (File file : totalfiles) {
			if(file.getName().equals("sample.xlsx")) {
				System.out.println("file downloaded");
				break;
			}
		}
		
	}

}
