package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();
		WebElement drop_m=driver.findElement(By.id("demo_basic"));
		Select sp = new Select(drop_m);
		
		sp.selectByIndex(1);
		Thread.sleep(2000);
		
//		sp.deselectByValue("2");
		
		WebElement drop_g=driver.findElement(By.name("demo_groups"));
		Select sw = new Select(drop_g);
		
		sw.selectByValue("6");
		
		WebElement drop_l=driver.findElement(By.id("demo_label"));
		Select sh = new Select(drop_l);
		
		sh.selectByIndex(0);
		Thread.sleep(2000);
		
		sh.selectByValue("AZ");
		Thread.sleep(2000);
		
		sh.selectByVisibleText("Colorado");
		
		WebElement drop_k=driver.findElement(By.name("demo_basic_2"));
		Select su = new Select(drop_k);
		
		su.selectByIndex(2);
		Thread.sleep(2000);
		
		su.selectByValue("FL");
		Thread.sleep(2000);
		
		su.selectByVisibleText("Indiana");
		Thread.sleep(2000);
		
		sw.deselectByValue("6");
		
		
		
		
		
		
	}

}
