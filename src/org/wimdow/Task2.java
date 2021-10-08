package org.wimdow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		String old = driver.getWindowHandle();
		System.out.println(old);
		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("celing fan"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			driver.switchTo().window(string);
			
		}
		driver.findElement(By.xpath("//div[text()='Control Type Included']")).click();
	}

}
