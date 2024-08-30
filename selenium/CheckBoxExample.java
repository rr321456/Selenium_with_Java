package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Interact with checkbox
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		//select any checkbox
		WebElement rememberme = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]"));
		rememberme.click();
		
		//confirm checkbox is selected
		boolean check1 = rememberme.isSelected();
		System.out.println(check1);
		
		//unselect the selected checkbox
		WebElement selectedbox = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]"));
		if(selectedbox.isSelected()) {
			selectedbox.click();
		}
	}

}
