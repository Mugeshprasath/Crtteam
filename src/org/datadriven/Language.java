package org.datadriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Language {
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement findElement = driver.findElement(By.xpath("//div[@id='msdd']"));
		findElement.click();
		/*WebElement findElement2 = driver.findElement(By.xpath("//a[text()='English']"));
		findElement2.click();
		WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Finnish']"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Russian']"));
		findElement4.click();
		WebElement findElement5 = driver.findElement(By.xpath("//label[text()='Languages']"));
			findElement5.click();*/
		

		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Spanish']"));
		
		JavascriptExecutor executor=(JavascriptExecutor )driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", findElement2);
		executor.executeScript("arguments[0].click()",findElement2 );
	WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Vietnamese']"));
	executor.executeScript("arguments[0].scrollIntoView(true)", findElement2);
	executor.executeScript("arguments[0].click()",findElement3 );
	WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Arabic']"));
	executor.executeScript("arguments[0].scrollIntoView(false)", findElement4);
	executor.executeScript("arguments[0].click()",findElement4);
	WebElement findElement5 = driver.findElement(By.xpath("//label[text()='Languages']"));
	findElement5.click();
	
	/*Select a=new Select(findElement);
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		for (WebElement webElement2 : allSelectedOptions) {
			String text2 = webElement2.getText();
			System.out.println(text2);*/
			
		}
	}
	
	
	
	




