package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExtendedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interact with Links
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//navigate helps to move forward or backward
		driver.navigate().to("https://the-internet.herokuapp.com/redirector");
		
		//click home page link
		WebElement homepagelink = driver.findElement(By.linkText("here"));
		homepagelink.click();
		driver.navigate().back();//move previous page
		
		//find where the link is going without click the link
		WebElement wheretogo = driver.findElement(By.linkText("here"));
		String where = wheretogo.getAttribute("href");
		System.out.println("This link is going to" +where);
		
		//click the homepage link without find
		homepagelink.click();
	    
		
		//find the link is broken or not
		WebElement brokenlink = driver.findElement(By.linkText("404"));
		brokenlink.click();
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("The link is broken");
		}
		driver.navigate().back();
		
		
		
		//find the number of links in this page
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		int linkcount = totallinks.size();
		System.out.println("Total number of links" +linkcount);
	}

}
