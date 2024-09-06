package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interact with images
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		
		//click image to goto next page
		/*WebElement firstimage = driver.findElement(By.id("Image1_img"));
		firstimage.click();*/
		
		//verify broken image or not
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\'post-body-7114928646577071695\']/div[1]/div[2]/a/img"));
		
		//if "naturalwidth"=0, its an broken image
		if(brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is broken");
		}else {
			System.out.println("image is not broken");
		}
	}

}
