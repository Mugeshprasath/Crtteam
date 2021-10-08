package org.wimdow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		String old = driver.getWindowHandle();
		System.out.println(old);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone x"+Keys.ENTER);
		WebElement findElement = driver.findElement(By.xpath
				("//span[text()='Apple iPhone X, 64GB, Space Gray - Unlocked (Renewed Premium)']"));
		
		Actions action = new Actions(driver);
		action.contextClick(findElement).perform();
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> new1= driver.getWindowHandles();
		System.out.println(new1);
		for (String bbb : new1) {
			
			 if(!new1.equals(old)) {
		 driver.switchTo().window(bbb);
			
		}
		}
       
	     WebElement findElement2 = driver.findElement(By.xpath("//span[text()='$363.00']"));
		String text = findElement2.getText();
        System.out.println(text);
		WebElement findElement3 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		findElement3.click();
		driver.switchTo().window(old);
		driver.quit();
	
		
		
			
		

}
}