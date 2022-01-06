package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("hopentapsttp://leaftaps.com//control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("siva");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneAreaCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("abcd@gmail.com");
		//driver.findElement(By.xpath("//input[@id='c']")).sendKeys("7708723361");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		

	}

}
