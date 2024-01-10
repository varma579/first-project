package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement drop_s= driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select sc = new Select(drop_s);
		sc.selectByIndex(1);
		Thread.sleep(3000);
		sc.selectByValue("Apple");
		Thread.sleep(3000);
		sc.selectByVisibleText("Yahoo");
		
		
		WebElement drop_z =driver.findElement(By.xpath("//select[@id=\"second\"]"));
		Select sm = new Select(drop_z);
		sm.selectByIndex(1);
		Thread.sleep(3000);
		sm.selectByValue("burger");
		Thread.sleep(3000);
		sm.selectByVisibleText("Bonda");
		
		

	}

}
