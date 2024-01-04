package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookConnection {

	public static void main(String[] args) {

		EdgeDriver edgeDriver = new EdgeDriver();
		String url = "http://en-gb.facebook.com/";
		edgeDriver.get(url);
		edgeDriver.manage().window().maximize();
		edgeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		edgeDriver.findElement(By.linkText("Create new account")).click();
		edgeDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sakthi");
		edgeDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dasan");
		edgeDriver.findElement(By.name("reg_email__")).sendKeys("solaysakthi.23@gmail.com");
		edgeDriver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("solaysakthi.23@gmail.com");
		edgeDriver.findElement(By.id("password_step_input")).sendKeys("Sol@i2311");
		
		WebElement sourceBirthDay = edgeDriver.findElement(By.name("birthday_day"));
		Select birthdaySelect = new Select(sourceBirthDay);
		birthdaySelect.selectByIndex(22);
		
		WebElement sourceBirthMonth = edgeDriver.findElement(By.name("birthday_month"));
		Select birthMonthSelect = new Select(sourceBirthMonth);
		birthMonthSelect.selectByIndex(10);
		
		WebElement sourceBirthYear = edgeDriver.findElement(By.name("birthday_year"));
		Select birthYearSelect = new Select(sourceBirthYear);
		birthYearSelect.selectByVisibleText("2001");
		
		edgeDriver.findElement(By.xpath("//label[text()='Male']")).click();
		
		String title = edgeDriver.getTitle();
		System.out.println(title);
		
	}

}