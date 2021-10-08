package org.framesalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__"
				+ "=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	driver.findElement(By.id("DUMMY1")).sendKeys("abcdef");
	driver.findElement(By.id("user-id-goahead")).click();
//	driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("123456");
	//driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
	driver.findElement(By.id("text")).sendKeys("asdfg");
	driver.findElement(By.id("password")).sendKeys("aswer");
	driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
	
	
	/*Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.accept();*/
	
	
	
	
	
	}

}
