package org.datadriven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate1 {
	public static void main(String[] args) throws InterruptedException {
		
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
	System.out.println(size);

	/*		
	 ArrayList<WebElement> list=new ArrayList<WebElement>();
	
	 boolean add = list.addAll(options);
	 int size3 = list.size();
	 System.out.println("no of List"+size3);
		*/
	 Set<WebElement> set=new HashSet<WebElement>();
	 boolean addAll = set.addAll(options);
	 int size2 = set.size();
	 System.out.println("no of set"+size2);
	
	
	if (size==size2) {
		System.out.println("thers is no duplicate");
	}else {
		System.out.println("duplicate is present");
	}
		
	}
}

