package org.datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class4 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		findElement.click();
		Thread.sleep(5000);
		WebElement get1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(get1);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		String tagName = options.get(size/2).getText();
		System.out.println(tagName);
		


			
		
		driver.quit();
	}

}



