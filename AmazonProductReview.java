package week5day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonProductReview {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		EdgeOptions edgeOption = new EdgeOptions();
		edgeOption.addArguments("--start-maximized","--disable-notifications");
		
		EdgeDriver edgeDriver = new EdgeDriver(edgeOption);
		String url = "https://www.amazon.in/";
		edgeDriver.get(url);
		//edgeDriver.manage().window().maximize();
		edgeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		edgeDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OnePlus 9 Pro", Keys.ENTER);
		
		String productPrice = edgeDriver.findElement(By.xpath("(//span[@class='a-price-whole']/ancestor::span[@class='a-price'])[1]")).getText();
		int productPriceInteger = Integer.parseInt(productPrice.replaceAll("[^0-9]", ""));
		System.out.println("Product Price in Window : " + productPriceInteger);
		
		WebElement hoverRating = edgeDriver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-2-5 aok-align-bottom']"));
		Actions action = new Actions(edgeDriver);
		action.moveToElement(hoverRating).perform();
		Thread.sleep(5000);
		hoverRating.click();
		String productRating = edgeDriver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
		System.out.println("Product Rating : " + productRating);
		
		edgeDriver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		Set<String> setWindowHandles = edgeDriver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(setWindowHandles);
		edgeDriver.switchTo().window(listWindowHandles.get(1));
		
		File sourceOne = edgeDriver.getScreenshotAs(OutputType.FILE);
		File destinationOne = new File("./snap/001.jpeg");
	    FileUtils.copyFile(sourceOne, destinationOne);
		
	    edgeDriver.findElement(By.id("add-to-cart-button")).click();
	    
	    String cartPrice = edgeDriver.findElement(By.xpath("(//span[@class='a-price']//span[@class='a-price-whole'])[1]")).getText();
	    int cartPriceInteger = Integer.parseInt(cartPrice.replaceAll("[^0-9]", ""));
		System.out.println("cart Price in Window : " + cartPriceInteger);
	    
	    if(productPriceInteger == cartPriceInteger) {
	    	System.out.println("Prices are equal");
	    }
	    else {
	    	System.out.println("Prices are not equal");
	    }
	 
	    
	}

}
