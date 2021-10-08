package Javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAsk2 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		executor.executeScript("arguments[0].scrollIntoView(true)",findElement);
	}

}
