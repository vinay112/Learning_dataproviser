package Home_page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.base;

public class Daily_IE extends base {

	@Test(enabled = false)
	public void bluejean() throws IOException, InterruptedException, AWTException {

		Robot robot = new Robot();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[3]/a"));
		element.click();
		//robot.mouseMove(198,645); // move mouse point to specific location
		robot.delay(1500); // delay is to make code wait for mentioned milliseconds before executing next
							// step
		//robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click
		//robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click
	
		
		//robot.keyPress(KeyEvent.VK_DOWN);// press keyboard arrow key to select Save radio button
		Thread.sleep(2000);
		robot.delay(1500);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
	
	    System.out.println("Get the x cordinate = "+element.getLocation().getX());
	    System.out.println("Get the y cordinate = "+element.getLocation().getY());
		// press enter key of keyboard to perform above selected
		// action//*[@id="content"]/div/div[1]/ul[1]/li[3]/a
	}
	@Test
	public void testdata1() throws IOException
	{
		
		WebElement txtUserName = driver.findElement(By.id("username"));
			 
			Actions builder = new Actions(driver);
			Action seriesOfActions = (Action) builder
			 .moveToElement(txtUserName)
			 .click()
			 .keyDown(txtUserName, Keys.SHIFT)
			 .sendKeys(txtUserName, "hello")
			 .keyUp(txtUserName, Keys.SHIFT)
			 .doubleClick(txtUserName);
//			 .contextClick();
//			 .build();
			seriesOfActions.perform();
	}
	
	}


