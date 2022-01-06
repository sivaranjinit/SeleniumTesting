package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LgLink {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("http://www.leafground.com/");
      driver.findElement(By.xpath("//li[@class='col-lg-3 col-md-3 col-sm-3']//img[@alt='Link']")).click();
      driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
      driver.findElement(By.xpath("//li[@class='col-lg-3 col-md-3 col-sm-3']//img[@alt='Link']")).click();
String attribute = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"))
.getAttribute("href");

System.out.println(attribute);



	}

}
