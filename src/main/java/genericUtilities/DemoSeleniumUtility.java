package genericUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/**
 * @author reshma
 * This class consists of generics methods
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DemoSeleniumUtility {

	/**
	 * This method will maximize the browser window
	 * @param d
	 */
	public void maximizeWindow(WebDriver d) {
		d.manage().window().maximize();
	}
	/**
	 * This method will minimize the browser window
	 * @param d
	 */
	public void minimizeWindow(WebDriver d) {
		d.manage().window().minimize();
	}
	/**
	 * This method will scroll down the page by 500 units 
	 * @param d
	 */
	public void scrollDownPage(WebDriver d) {
		Actions act= new Actions(d);
		act.scrollByAmount(0, 500).perform();
	}
	/**
	 * This method will scroll up the page by 500 units 
	 * @param d
	 */
	public void scrollUpPage(WebDriver d) {
		Actions act= new Actions(d);
		act.scrollByAmount(0, -500).perform();
	}
	
	/**
	 * This method will move to element
	 * @param d
	 * @param element
	 */
	public void scrollToElement(WebDriver d,WebElement element) {
		Actions act= new Actions(d);
		act.moveToElement(element).perform();
	}
	/**
	 * This method will perform right click on the element
	 * @param d
	 * @param e
	 */
	public void rightClick(WebDriver d , WebElement e) {
		Actions act= new Actions(d);
		act.contextClick(e);
	}
	/**
	 * This method will perform double click on element
	 * @param d
	 * @param e
	 */
	public void doubleClick(WebDriver d , WebElement e) {
		Actions act= new Actions(d);
		act.doubleClick(e);
	}
	/**
	 * This method will perform drag and drop operation
	 * @param d
	 * @param src
	 * @param dsnt
	 */
	public void dragAndDrop(WebDriver d , WebElement src, WebElement dsnt) {
		Actions act= new Actions(d);
		act.dragAndDrop(src,dsnt);
	}
	
	/**
	 * This method will select option by value
	 * @param e
	 * @param value
	 */
	public void dropDownHandle(WebElement e , String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}
	
	/**
	 * This method will select option by index
	 * @param e
	 * @param index
	 */
	public void dropDownHandle(WebElement e , int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	
	/**
	 * This method will select option by visible text
	 * @param e
	 * @param str
	 */
	public void dropDownHandle(String str,WebElement e ) {
		Select s = new Select(e);
		s.selectByVisibleText(str);
	}
	
	/**
	 * This method will switch to alert pop up
	 * @param d
	 */
	public void switchToAlert(WebDriver d) {
		d.switchTo().alert();
	}
	/**
	 * This method will switch to alert and accept it
	 * @param d
	 */
	public void acceptAlert(WebDriver d) {
		d.switchTo().alert().accept();
	}
	
	/**
	 * This method will switch to alert and dismiss it
	 * @param d
	 */
	public void dismissAlert(WebDriver d) {
		d.switchTo().alert().dismiss();
	}
	
	/**
	 * This method will switch to alert and send data through sendkeys()
	 * @param d
	 */
	public void sendDataToAlert(WebDriver d,String str) {
		d.switchTo().alert().sendKeys(str);
	}
	
	public void takeScreenShot(WebDriver d) throws IOException {
	     TakesScreenshot ts=(TakesScreenshot) d;
	     File scr=ts.getScreenshotAs(OutputType.FILE);
	     File dsnt= new File(".\\demoScreenShot");
	     FileHandler.copy(scr, dsnt);
	}
	
}
