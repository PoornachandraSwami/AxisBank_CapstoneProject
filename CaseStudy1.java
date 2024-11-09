package AutomationCapstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// Launching the website
		driver.navigate().to("https://testautomationpractice.blogspot.com/ ");
		System.out.println("Launched testautomationpractice page");
		
		// Entering name 
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Agile11");
		
		// Printing the name inputed in the name box
		String name=driver.findElement(By.xpath("//*[@id=\"name\"]")).getAttribute("value");
		System.out.println("name : " +name);
		
		// Entering Email address
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("agile11@gmail.com");
		
		//Printing the value of email inputed in the email box
		String email=driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value");
		System.out.println("Email address: " + email);
		
		//Entering Phone number
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("7676167391");
		
		//Printing the value of phone number inputed in the phone box
		String phone_number=driver.findElement(By.xpath("//*[@id=\"phone\"]")).getAttribute("value");
		System.out.println("Phone number : " +phone_number);

		// Clearing the name from name box
		driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
		//inputing new name
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Poorna");
		
		//Selecting Gender
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		
		// Selecting Day
		driver.findElement(By.xpath("//*[@id=\"thursday\"]")).click();
	}

}
