package org.datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement findElement = driver.findElement(By.id("Skills"));
		Select s=new Select(findElement);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("this is the total number of options"+size);
		//iterate
		/*for (WebElement i : options) {
			String attribute = i.getAttribute("value");
			System.out.println(attribute);
		}*/
		for (int i = 0; i < options.size(); i++) {
			Select s1=new Select(findElement);
			 WebElement webElement = options.get(i);
			 String attribute = webElement.getAttribute("value");
			 System.out.println(attribute);
			

}
	}
}