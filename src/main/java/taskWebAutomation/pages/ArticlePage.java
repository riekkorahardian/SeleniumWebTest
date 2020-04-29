package taskWebAutomation.pages;

import taskWebAutomation.WebDriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {

    public String getName(){
        WebElement text = WebDriverInstance.driver.findElement(By.xpath("//h1[@id='firstHeading']"));
        String findText = text.getText();
        return findText;
    }

    public String getNumber(){
        WebElement text2 = WebDriverInstance.driver.findElement(By.xpath("//big/a/span"));
        String fingText2 = text2.getText();
        return fingText2;
    }
}
