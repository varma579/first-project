package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		WebElement drop_p= driver.findElement(By.tagName("select"));
		Select sc = new Select(drop_p);
		
		sc.selectByIndex(3);
		Thread.sleep(2000);
		sc.selectByValue("AGO");
		Thread.sleep(2000);
		sc.selectByVisibleText("Antigua and Barbuda");
		
	}

}
