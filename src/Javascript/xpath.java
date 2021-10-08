package Javascript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
			WebElement findElement = driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
			findElement.click();
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("india"+Keys.ENTER);
			
		
	

}
}