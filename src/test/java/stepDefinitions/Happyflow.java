package stepDefinitions;

import Utility.PropertiesFileReader;
import com.base.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.IlabpageObject;

import java.util.Properties;

public class Happyflow extends BaseClass {

        IlabpageObject ilabpageObject;
        PropertiesFileReader obj=new PropertiesFileReader();

        private Scenario scenario;

        private final Logger logger = Logger.getLogger(Happyflow.class);

        @Before
        public void initializeScenario(Scenario scenario) {
                this.scenario = scenario;
        }

        @After
        public void tearDown(Scenario scenario) {
                if(scenario.isFailed()) {
                        takeScreenShot(scenario);
                }

                try {
                        driver.quit();
                }
                catch(Exception e) {
                        System.out.println(String.valueOf(e));
                }
        }



        @Given("^I want to apply from ILab side$")
        public void i_want_to_apply_from_ilab_side() throws Throwable {
                Properties properties=obj.getProperty();
                System.out.println(properties);
                openBrowser( properties.getProperty("browser.baseURL"));

        }

        @When("^I click on careers$")
        public void i_click_on_careers()  {
            IlabpageObject ilabpageObject =new IlabpageObject(driver);
                ilabpageObject.clickCareeLink();
                takeScreenShot(this.scenario);
        }

        @Then("^i should be able to submit the application and quite the browser$")
        public void i_should_be_able_to_submit_the_application_and_quite_the_browser() throws Throwable {
                ilabpageObject =new IlabpageObject(driver);
                ilabpageObject.clickFirstJob();
                takeScreenShot(this.scenario);
        }

        @And("^select south Africa link$")
        public void select_south_africa_link() throws Throwable {
                takeScreenShot(this.scenario);
            
        }

        @And("^select the the advertised Jobs$")
        public void select_the_the_advertised_jobs() throws Throwable {
            
        }

        @And("^click on the apply online link$")
        public void click_on_the_apply_online_link() throws Throwable {
            
        }

        @And("^I should be able to enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
        public void i_should_be_able_to_enter_something_something_something(String applicatname, String emailaddress, String message, String strArg1, String strArg2, String strArg3) throws Throwable {
            
        }

    }


