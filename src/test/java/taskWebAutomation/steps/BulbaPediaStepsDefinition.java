package taskWebAutomation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import taskWebAutomation.pages.ArticlePage;
import taskWebAutomation.pages.MainPage;

public class BulbaPediaStepsDefinition {
    ArticlePage articlePage = new ArticlePage();
    MainPage mainPage = new MainPage();

    @Given("User open bulbapedia main page")
    public void userOpenBulbapediaMainPage() {
        mainPage.startPage();
    }
    @When("User type {string} on search field and press enter")
    public void userTypeOnSearchFieldAndPressEnter(String keyword) {
        mainPage.Searching(keyword);
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String name) {
        String Name = articlePage.getName();
        Assert.assertEquals(Name, name);
    }

    @Then("User see article with number {string} on article page")
    public void userSeeArticleWithNumberOnArticlePage(String number) {
        String Number = articlePage.getNumber();
        Assert.assertEquals(Number, number);
    }
}


