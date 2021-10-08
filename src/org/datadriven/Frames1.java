package org.datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement findElement2 = driver.findElement(By.id("i-icon-profile"));
		
		findElement2.click();
		WebElement findElement = driver.findElement(By.xpath("//li[@id='signInLink']"));
		findElement.click();
		List<WebElement> findElement3 = driver.findElements(By.tagName("iframe"));
		int size = findElement3.size();		
		System.out.println(size);
		
		//WebElement findElement5 = driver.findElement(By.xpath("(//iframe[@class='modalIframe'])[2]"));
		driver.switchTo().frame(1);
		WebElement findElement4 = driver.findElement(By.xpath("//input[@type='number']"));
		findElement4.sendKeys("78711909");
	}

}
