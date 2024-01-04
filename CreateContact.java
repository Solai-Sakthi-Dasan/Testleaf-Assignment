package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		EdgeDriver edgeDriver = new EdgeDriver();
		String url = "http://leaftaps.com/opentaps/control/main";
		edgeDriver.get(url);
		edgeDriver.manage().window().maximize();
		edgeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		edgeDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		edgeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		edgeDriver.findElement(By.className("decorativeSubmit")).click();
		edgeDriver.findElement(By.linkText("CRM/SFA")).click();
		edgeDriver.findElement(By.xpath("//a[text()='Contacts']"));
		edgeDriver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		edgeDriver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sakthi");
		edgeDriver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Sakthi");
		edgeDriver.findElement(By.name("firstNameLocal")).sendKeys("Sakthi");
		edgeDriver.findElement(By.name("lastNameLocal")).sendKeys("Dasan");
		edgeDriver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software");
		
		String description = "I am aspiring software developer who is undergoing the course in testleaf.";
		edgeDriver.findElement(By.id("createContactForm_description")).sendKeys(description);
		
		edgeDriver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("solaysakthi.23@gmail.com");
		
		WebElement sourceStateSelect = edgeDriver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateSelect = new Select(sourceStateSelect);
		stateSelect.selectByVisibleText("New York");
		
		edgeDriver.findElement(By.xpath("//input[@name='submitButton']")).click();
		edgeDriver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		edgeDriver.findElement(By.id("updateContactForm_description")).clear();
		
		String importantNote = "The details in description are erased and important note had written";
		edgeDriver.findElement(By.id("updateContactForm_importantNote")).sendKeys(importantNote);
		
		edgeDriver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title = edgeDriver.getTitle();
		System.out.println(title);
		
	}

}
