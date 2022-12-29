package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Hooks {


    //@After(order = 1, value = "@US005")
    @After
    public void tearDown(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        //if (!scenario.isFailed()) Driver.quitDriver();

        Driver.quitDriver();

        ReusableMethods.waitFor(2);
    }//

    /*
    What is hooks class in cucumber? Hooks has Before and After annotations.
    hooks will run Before and After each Scenario
    What is in your After in the hooks?
    -In cucumber hooks I use reports and I take screenshot
    -I designed my hooks. It takes screenshot when a test scenario fails.
    */

    @Before
    public void beforeRegistration(Scenario scenario) { // beforeRegistration

        Driver.getDriver().get("https://e2e-assessment.piton.com.tr/login");
    }



}