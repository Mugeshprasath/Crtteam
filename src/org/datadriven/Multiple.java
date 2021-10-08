package org.datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='cars']"));
		
	    Select a=new Select(findElement);
	    List<WebElement> options = a.getOptions();
	    int size = options.size();
	    for (int i=size-2;i<size;i++) {
	    	options.get(i);
			
		}
	    List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
	    for (WebElement webElement : allSelectedOptions) {
	    	String text = webElement.getText();
	    	System.out.println(text);
	    	
			
		}
	    
	  
			
		
			
		
	  
	
	
	
	
	
	}

}
