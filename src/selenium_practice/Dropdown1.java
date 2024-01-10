package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement drop_x = driver.findElement(By.id("country-list"));
		Select sp = new Select(drop_x);
		sp.selectByIndex(1);
		Thread.sleep(2000);
		sp.selectByValue("3");
		Thread.sleep(3000);
		sp.selectByVisibleText("India");
		
		

		WebElement drop_d=driver.findElement(By.name("state"));
		Select sx = new Select(drop_d);
		sx.selectByIndex(3);
		Thread.sleep(3000);
		sx.selectByValue("22");
		Thread.sleep(3000);
		sx.selectByVisibleText("Haryana");
		
		
		
		
		
		

	}

}
