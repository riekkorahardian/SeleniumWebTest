package taskWebAutomation.pages;

import org.openqa.selenium.Keys;
import taskWebAutomation.WebDriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

    public void startPage(){
     WebDriverInstance.driver.get("https://bulbapedia.bulbagarden.net/wiki/Main_Page/");
    }



    public void Searching (String Keyword){
        WebElement inputSearch = WebDriverInstance.driver.findElement(By.xpath("//input[@id='searchInput']"));
        inputSearch.sendKeys(Keyword + Keys.ENTER);
    }

}
