package seleniumPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.saucedemo.com/");
		 * System.out.println(driver.findElement(By.id("login-button")).getAttribute(
		 * "value"));
		 * System.out.println(driver.findElement(By.cssSelector("#login-button")).
		 * getAttribute("value"));
		 * System.out.println(driver.findElement(By.cssSelector("input#login-button")).
		 * getAttribute("value"));
		 * System.out.println(driver.findElement(By.xpath("//*[@id='login-button']")).
		 * getAttribute("value"));
		 * System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")
		 * ).getAttribute("value")); driver.quit();
		 */
		
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.findElement(By.name("login-button")).getAttribute("value")); 
		System.out.println(driver.findElement(By.cssSelector("[name='login-button']")).getAttribute("value")); 
		System.out.println(driver.findElement(By.cssSelector("input[name='login-button']")).getAttribute("value")); 
		System.out.println(driver.findElement(By.xpath("//*[@name='login-button']")).getAttribute("value")); 
		System.out.println(driver.findElement(By.xpath("//input[@name='login-button']")).getAttribute("value")); 
		driver.quit(); 
		
		
		
		
	}

}
