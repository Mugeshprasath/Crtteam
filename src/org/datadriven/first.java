package org.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class first {
	String[][] data= null;
	WebDriver driver;
	public String[][] logindata() throws BiffException, IOException {
		
		data=getexcel();
		return data;
	}

	private String[][] getexcel() throws BiffException, IOException {
		
		FileInputStream excel=new FileInputStream("C:\\Users\\ELCOT\\Documents\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		String testdata[][]=new String[rows-1][columns];
		
		for(int i=1;i<rows;i++) {
			for(int j=0;j<columns; j++) {
				testdata[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testdata;	
	}
	
	@BeforeTest
	public void beforetest() {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        
		
	}
	@AfterTest
	public void aftertest() {
		driver.quit();

	}
@Test(dataProvider="logindata")
	public void loginwith( String uname,String upass) {
		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement username = driver.findElement(By.xpath("//span[text()='Username']"));

username.sendKeys(uname);
WebElement userpass = driver.findElement(By.xpath("//span[text()='Password']"));

userpass.sendKeys(upass);
WebElement clk = driver.findElement(By.xpath("//input[@id='btnLogin']"));
clk.click();
	
		
	}
		
		

	}


	
	


