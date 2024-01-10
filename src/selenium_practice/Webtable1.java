package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		int rows =driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
		System.out.println("Total number of rows: "+rows);
		
		int cols=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr[1]//td")).size();
		System.out.println("Total number of columns: "+cols);
		
		for(int r = 2;r<=rows;r++) {
			String Language=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[\"+r+\"]//td[5]")).getText();
			if(Language.equals("English")) {
				driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[\"+r+\"]//td[1]")).click();
				
			}
			
		}
		
		
		
		
		}
		
		
		

	}


