package week5day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LeafGroundFrames {

	public static void main(String[] args) {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized", "--diable-notification");
		EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
		edgeDriver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		edgeDriver.switchTo().frame("frame1");
		System.out.println("Switched to first frame");
		edgeDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sakthi");
		System.out.println("Filled the topic");
		
		edgeDriver.switchTo().frame("frame3");
		System.out.println("Switched to nested frame of the first frame ");
		edgeDriver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println("Clicked the checkbox");
		
		edgeDriver.switchTo().defaultContent();
		System.out.println("Switched to Default frame");
		
		edgeDriver.switchTo().frame("frame2");
		System.out.println("Switched to second frame");
		
		WebElement source = edgeDriver.findElement(By.xpath("//select[@id='animals']"));
		Select select = new Select(source);
		select.selectByValue("avatar");
		System.out.println("Selected Avatar in the dropdownx");
		
	}

}
