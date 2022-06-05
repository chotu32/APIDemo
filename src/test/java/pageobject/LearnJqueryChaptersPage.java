package pageobject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BaseConfig;

public class LearnJqueryChaptersPage extends BaseConfig  {

	WebDriver driver;
	public static final By CHAPTERS_LIST = By.xpath("//aside[@class='four columns'][position()='1']/ul/li/a");
	public static final By RECENTLY_UPDATED_LIST = By.xpath("//aside[@class='four columns'][position()='2']/ul/li/a");
    
    //Intializing constructor
	public LearnJqueryChaptersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// to scroll upto element found
			public void bottomScroll(WebDriver driver)
			{
				
				//waitForExpectedElement(driver, BOTTOMSCROLL);
					//WebElement element = driver.findElement(BOTTOMSCROLL);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					 // This  will scroll down the page by  1000 pixel vertical		
			       js.executeScript("window.scrollBy(0,1000)");
					//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			}
		
		
		public void chaptersList(WebDriver driver) throws InterruptedException 
		{
				waitForExpectedElement(driver, CHAPTERS_LIST);
				
				//WebElement element = driver.findElement(ALLFLIGHTS);
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
				
				List<WebElement> drop = driver.findElements(CHAPTERS_LIST);
				ArrayList<String> list = new ArrayList<String>();
			//	System.out.println();
				//System.out.println("List Size : " + drop.size());
				//System.out.println();
				//Storing List of text elements into String array
				
				for(WebElement e : drop){
					list.add(e.getText());
				}
				/*for(int i =0; i < drop.size(); i++)
				{
					list.add(drop.get(i).getAttribute("href"));
				}*/
				String urls[] = new String[drop.size()];
				//System.out.println("Url Length : " + urls.length);
				for(int i = 0; i < drop.size(); i++)
				{
					urls[i] = drop.get(i).getAttribute("href");
				}
				System.out.println();
				for(int i = 0; i < drop.size(); i++)
				{
					driver.navigate().to(urls[i]);
					//Thread.sleep(5000);
					String currentURL = driver.getCurrentUrl();
			        System.out.println("Url Name : " + currentURL);
			        
			        String currentTitle = driver.getTitle();
			        System.out.println("Title Name : " + currentTitle);
					driver.navigate().back();
					System.out.println();
				}
		}
				
		public void recentlyUpdatedList(WebDriver driver) throws InterruptedException 
		{
				waitForExpectedElement(driver, RECENTLY_UPDATED_LIST);
				List<WebElement> drop = driver.findElements(RECENTLY_UPDATED_LIST);
				ArrayList<String> list = new ArrayList<String>();
				//System.out.println();
				//System.out.println("List Size : " + drop.size());
				//System.out.println();
			
				for(WebElement e : drop){
					list.add(e.getText());
				}
				String urls[] = new String[drop.size()];
				//System.out.println("Url Length : " + urls.length);
				for(int i = 0; i < drop.size(); i++)
				{
					urls[i] = drop.get(i).getAttribute("href");
				}
				System.out.println();
				for(int i = 0; i < drop.size(); i++)
				{
					driver.navigate().to(urls[i]);
					
					//Thread.sleep(5000);
					String currentURL = driver.getCurrentUrl();
			        System.out.println("Url Name : " + currentURL);
			 
			        String currentTitle = driver.getTitle();
			        System.out.println("Title Name : " + currentTitle);
			        
					driver.navigate().back();
					System.out.println();
				}
		}
	
	
}
