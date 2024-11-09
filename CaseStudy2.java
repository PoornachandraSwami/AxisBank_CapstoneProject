package AutomationCapstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaseStudy2 {
	public static void main(String[] args) throws InterruptedException {
        WebDriver s = new ChromeDriver();
        s.manage().window().maximize();
        s.navigate().to("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&ddm=1&dsh=S1681685979:1730201186832295&ec=GAlAFw&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&TL=AKOx4s1a8yQRLciVZDXTome49NQwZQGK4OyPmLk0U7AE28TB062qo79YkfIbeuoF");
        
        // Launching the Gmail in Browser
        s.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();  
        s.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Agile11");  // Entering the input in FirstName section
        
        String string = s.findElement(By.xpath("//*[@id=\"firstName\"]")).getAttribute("value");  // Printing the Value from First name section
        System.out.println(string);
        
        s.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Axis Bank");
        s.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();  // Entering the input in Last Name Section
        Thread.sleep(5000);
        
        Select select = new Select(s.findElement(By.id("month")));  // Selecting the Month Dropdown
        select.selectByVisibleText("March");  // Selecting the month as March
        
        s.findElement(By.id("day")).sendKeys("5");  // Entering the date in Day Section
        s.findElement(By.id("year")).sendKeys("2001");  // Entering the Year in Year Section
        s.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();  // Clicking on the Next Button
        
        Select select1 = new Select(s.findElement(By.xpath("//*[@id=\"gender\"]")));  // Selecting the Gender Dropdown
        select1.selectByIndex(2);
        
        s.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();  // Clicking on the Next Button
    }
}


