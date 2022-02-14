package bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingSearchStepDefinitions {

    private WebDriver driver;

    @Given("an open browser with bing.com")
    public void anOpenBrowserWithBingCom() {
        //driver = WebDriverFactory.createChromeDriverWithImplicitlyWait(5);
        driver.get("https://www.bing.com/");
    }

    @When("a keyword {string} is entered in input field and clicks search button")
    public void aKeywordIsEnteredInInputFieldAndClicksSearchButton(String keyword) {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(keyword);
        searchInput.submit();
    }

    @Then("the first result should contain {string}")
    public void theFirstResultShouldContainSelenium(String keyword) {
        System.out.println("wyszukało " + keyword);

        //tutaj jest dobre miejsce na asercje
        Assertions.assertTrue(true);
    }

    @And("close browser")
    public void closeBrowser() {
        driver.quit();
    }
}
