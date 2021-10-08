package org.datadriven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class15 {

public static void main(String[] args) throws InterruptedException {
		
	int size4 = 0;
	int size2 = 0;
	String text = null;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	findElement.click();
	Thread.sleep(5000);
	
	WebElement get1 = driver.findElement(By.xpath("//select[@id='year']"));
	Select s=new Select(get1);
	
	
		
	List<WebElement> options = s.getOptions();
	int size = options.size();
	
	
	
		
		for (WebElement webElement2 : options) {
			String text1 = webElement2.getText();
			int size3 = options.size();
			for(int i=0;i<size3;i++) {
				List<String> list=new ArrayList<String>();
			 boolean add = list.add(text1);
			  size4 = list.size();
			 
		
			Set<String> set=new HashSet<String>();
			 boolean addAll = set.addAll(list);
			 size2 = set.size();
		}
	System.out.println(size2);
	System.out.println(size4);
		}
	 if (size4==size2) {
			System.out.println("thers is no duplicate");
		}else {
			System.out.println("duplicate is present");
		}

	
	
		
	
	
	
	
	driver.quit();
}

}
