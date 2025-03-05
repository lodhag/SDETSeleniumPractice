//Automate Login Page: Open a website (OpenCart/Amazon/Flipkart), enter credentials, and verify login.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	@Test
	public void facebooklogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Title: " + driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("lodhagourav7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("7209944734@Gg");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
