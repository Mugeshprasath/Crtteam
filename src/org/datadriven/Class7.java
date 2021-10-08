package org.datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class7 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		findElement.click();
		Thread.sleep(5000);
		WebElement get1 = driver.findElement(By.xpath("//span[@id='u_2_l_il']"));
		String text = get1.getAttribute("value");
		System.out.println(text);

}
}