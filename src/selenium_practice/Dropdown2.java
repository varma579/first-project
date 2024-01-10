package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();

		
		driver.findElement(By.cssSelector("svg[height=\"16\"]")).click();
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]//li"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String city = "Bengaluru";
		for(WebElement ele:options) {
			if(ele.getText().equals(city)) {
				ele.click();
				break;
				
			}
		}
		
		
		}
	}


