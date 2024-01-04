package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {

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
		edgeDriver.findElement(By.xpath("//a[text()='Leads']")).click();
		edgeDriver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		edgeDriver.findElement(By.xpath("//span[text()='Email']")).click();
		
		String email = "shastiram@gmail.com";
		edgeDriver.findElement(By.name("emailAddress")).sendKeys(email);
		edgeDriver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//a[text()='ram']
		String ogName = "ram";
		edgeDriver.findElement(By.linkText("10083")).click();
		edgeDriver.findElement(By.linkText("Duplicate Lead")).click();
		edgeDriver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		String duplicateName = edgeDriver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(ogName.equals(duplicateName)) {
			System.out.println("Verified the duplicate name");
		}
		else {
			System.out.println("Duplicate name is not verified");
		}
	}

}
