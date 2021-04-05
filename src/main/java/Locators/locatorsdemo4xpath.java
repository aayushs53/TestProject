package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo4xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='search_query_top' and @name='Searchquery']")).click();

	}

}
