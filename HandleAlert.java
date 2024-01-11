package week5day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver edgeDriver = new EdgeDriver();
		String url = "https://leafground.com/alert.xhtml";
		edgeDriver.get(url);
		edgeDriver.manage().window().maximize();
		edgeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		edgeDriver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Alert alert = edgeDriver.switchTo().alert();
		alert.accept();
		
		edgeDriver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.accept();
		System.out.println("Alert Accepted");
		edgeDriver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		System.out.println("Alert Dismissed");
		
		edgeDriver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		WebElement sweetBox = edgeDriver.findElement(By.xpath("//span[text()='Dismiss']"));
		System.out.println(sweetBox.getText());
		sweetBox.click();
		
		edgeDriver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(5000);
		edgeDriver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		System.out.println("Sweet Alert Closed");
		
		edgeDriver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
		alert.sendKeys("Sakthi");
		alert.accept();
		System.out.println("Window prompt filled successfully");
		
		edgeDriver.findElement(By.xpath("//span[text()='Delete']")).click();
		edgeDriver.findElement(By.xpath("//span[text()='Yes']")).click();
		System.out.println("Prompt deleted successfully");
		
		edgeDriver.findElement(By.xpath("//h5[text()='Minimize and Maximize']/following::span[text()='Show']")).click();
		edgeDriver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		System.out.println("Window Minimized Successfully");
		
		edgeDriver.findElement(By.xpath("//h5[text()='Minimize and Maximize']/following::span[text()='Show']")).click();
		edgeDriver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		System.out.println("Window Maximized Successfully");
		
		edgeDriver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();
		System.out.println("Window closed Successfully");
		
		
		
	}

}
