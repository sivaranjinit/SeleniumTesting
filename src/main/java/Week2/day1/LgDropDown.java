package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LgDropDown {

	public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	   driver.get("http://www.leafground.com/");
	   driver.manage().window().maximize();
   driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
   Select dp=new Select(driver.findElement(By.id("dropdown1")));
   dp.selectByIndex(1);
   Select dpr=new Select(driver.findElement(By.name("dropdown2")));
   dpr.selectByVisibleText("Selenium");
   Select drp=new Select(driver.findElement(By.name("dropdown3")));
   drp.selectByValue("2");
   
  
	}

}
