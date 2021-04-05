package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		int sliders= driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
		
		int links = driver.findElements(By.tagName("a")).size();
		
		System.out.println(links);
 
	}

}
