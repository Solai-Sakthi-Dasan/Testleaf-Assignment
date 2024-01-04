package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		String phoneNumber = "9517538254";
		edgeDriver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		edgeDriver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		/*edgeDriver.findElement(By.xpath("//a[text()='Ramsy']")).click();
		edgeDriver.findElement(By.className("subMenuButtonDangerous")).click();*/
	
		edgeDriver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		edgeDriver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ramsy");
		edgeDriver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String record = edgeDriver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(record);
		
		if(record.contains("No records")) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not deleted");
		}

	}

}
