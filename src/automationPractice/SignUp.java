package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.name("email_create")).sendKeys("practice_automation14@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		//radio button
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		
		//first name text box
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Abby");
		//surname text box
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Dahal");
		//email confirmation
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		//setting the password
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("practice_automation_password");
		//date of birth (month)
		driver.findElement(By.xpath("//*[@id=\"days\"]")).click();
		//choose the month from drop down
		driver.findElement(By.xpath("//*[@id=\"days\"]/option[14]")).click();
		

	}

}
