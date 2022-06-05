package stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobject.LearnJqueryChaptersPage;
import utilities.BaseConfig;
import utilities.ConfigClass;
//import utilities.Utilities;


public class LJQStepDefinition extends BaseConfig {

	LearnJqueryChaptersPage objLJQ= new LearnJqueryChaptersPage(driver);
	ConfigClass config=new ConfigClass();
	//Utilities objUtil = new Utilities();
	Scenario scenario;
	BaseConfig objBC = new BaseConfig();
	Logger logger = Logger.getLogger(LearnJqueryStepDefinition.class);
	
	@Before
	public void start(Scenario scenario) throws Exception{
		this.scenario=scenario;
		config.loadPropertyFile();
		PropertyConfigurator.configure("./Log4j/log4j.properties");
	}
	
	@Given("^user is already on Jquery$")
	public void user_is_already_on_Jquery() throws Throwable {
	    launchBrowser(config.getProperty("url"));
	    scenario.write("Browser is launched With learn.jquery.com page ");
	    logger.info("Browser launched & url opened");
	    System.out.println();
	}

	@When("^user goes to the LearnJquery$")
	public void user_goes_to_the_LearnJquery() throws Throwable {
		String actualTitle=driver.getTitle();
		System.out.println("Page Title : " + actualTitle);
		String expectedTitle="jQuery Learning Center";
		Assert.assertEquals(expectedTitle, actualTitle);
		//scenario.write("Both strings are matched");
		objLJQ.bottomScroll(driver);
		scenario.write("Page Scrolled Bottom");
		 logger.info("Page Scrolled Bottom");
	}

	@Then("^user click the chapters link and user get the navigated page url and page title and user get back to the home$")
	public void user_click_the_chapters_link_and_user_get_the_navigated_page_url_and_page_title_and_user_get_back_to_the_home() throws Throwable {
		objLJQ.chaptersList(driver);
		//objUtil.captureScreenshot(driver, "HomePage");
	    
	}

	@Then("^user click the Recently Updated link and user get the navigated page url and page title and user get back to the home$")
	public void user_click_the_Recently_Updated_link_and_user_get_the_navigated_page_url_and_page_title_and_user_get_back_to_the_home() throws Throwable {
	   objLJQ.recentlyUpdatedList(driver);
	}	
	
	@Then("^browse$")
	public void browser_close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	    //System.out.println();
	    scenario.write("Browser is closed");
	}
}
