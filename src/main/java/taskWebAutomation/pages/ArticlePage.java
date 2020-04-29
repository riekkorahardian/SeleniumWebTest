package taskWebAutomation.pages;

import taskWebAutomation.WebDriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {

    public String getName(){
        WebElement text = WebDriverInstance.driver.findElement(By.xpath("//big//big/b"));
        String findText = text.getText();
        return findText;
    }

    public String getNumber(){
        WebElement text2 = WebDriverInstance.driver.findElement(By.xpath("//big/big/a"));
        String fingText2 = text2.getText();
        return fingText2;
    }
}
