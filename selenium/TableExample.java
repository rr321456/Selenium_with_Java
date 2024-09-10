package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interact with Table
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		//find the number of columns
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("No of columns" +columncount);
		
		//find the number of rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowcount = rows.size();
		System.out.println("No of rows" +rowcount);
		
		//Find the age of the 'first name - Kierra'
		WebElement getage = driver.findElement(By.xpath
				("//td[normalize-space()='Kierra']//following::td[2]"));//"following" is xpath's syntax 
		String age = getage.getText();
		System.out.println("The age is" +age);
		
		//find the least salary & its department
		List<WebElement> allsalary = driver.findElements(By.xpath("//td[5]"));
		List<Integer> numberlist = new ArrayList<Integer>();
		for (WebElement webElement : allsalary) {
			String individualvalue = webElement.getText();
			numberlist.add(Integer.parseInt(individualvalue));//convert the string value into integer  & adding
		}
		System.out.println("Final list" +numberlist);
		int smallvalue = Collections.min(numberlist);
		System.out.println(smallvalue);
		String salarystring = Integer.toString(smallvalue);//convert the int into string
		String finalxpath = "//td[normalize-space()="+"\"" +salarystring+ "\""+"]//following::td[1]";
		System.out.println(finalxpath);
		
		
		WebElement check = driver.findElement(By.xpath(finalxpath));
		String finalcheck = check.getText();
		System.out.println(finalcheck);
		
	}

}
