package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("siva");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("T");
        driver.findElement(By.xpath("//input[@type='text'and@name=\"reg_email__\"]")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//input[@type='password'and@id='password_step_input']")).sendKeys("ssss");
        Select dp=new Select(driver.findElement(By.id("day")));
        dp.selectByValue("21");
        Select dr=new Select(driver.findElement(By.id("month")));
        dr.selectByVisibleText("Nov");
        Select sr=new Select(driver.findElement(By.id("year")));
        sr.selectByValue("1995");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
	}


}
