package taskWebAutomation.hooks;

import taskWebAutomation.WebDriver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverHook {

    @Before(value = "@Web")
    public void InitialiedWebDriver(){

        WebDriverInstance.initialize();
    }

    @After(value = "@Web")
    public void quitWebDriver(){
        WebDriverInstance.quit();

    }
}
