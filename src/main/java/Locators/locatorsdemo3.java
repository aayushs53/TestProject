package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("helloworld");
		driver.findElement(By.cssSelector("button[name=login]")).click();
		

	}

}
