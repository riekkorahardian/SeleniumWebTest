package taskWebAutomation.hooks;

import taskWebAutomation.WebDriver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverHook {

    @Before
    public void InitialiedWebDriver(){

        WebDriverInstance.initialize();
    }

    @After
    public void quitWebDriver(){
        WebDriverInstance.quit();

    }
}
