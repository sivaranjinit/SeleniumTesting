package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(("(//img[@class='wp-categories-icon svg-image'])[1]"))).click();
	//	Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("adc@email.com");
        driver.findElement(By.xpath("//input[@type='text'and @value='Append ']")).sendKeys("mahesh");
        String attribute = driver.findElement(By.xpath("//input[@type='text'and @value='TestLeaf']")).getAttribute("value");
System.out.println(attribute);
         driver.findElement(By.xpath("//input[@type='text'and @value='Clear me!!']")).clear();
         System.out.println(driver.getTitle());
	}

}
