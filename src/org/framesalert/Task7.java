package org.framesalert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		List<WebElement> findElement2 = driver.findElements(By.tagName("frameset"));
		int size = findElement2.size();
		System.out.println(size);
		driver.switchTo().frame("login_page");
		WebElement findElement1 = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		findElement1.sendKeys("123456");
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		findElement.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("//input[@id='fldPasswordDispId']"));
		findElement3.sendKeys("12345");
		
		WebElement findElement4 = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		findElement4.click();
	}

}
