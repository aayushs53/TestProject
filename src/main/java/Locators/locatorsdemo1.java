package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		int sliders= driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
		

	}

}
