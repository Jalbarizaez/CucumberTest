package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchSteps {
    WebDriver driver;

    @Given("The user is in the index page")
    public void theUserIsInIndexPage(){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("The user enters dresses in the search bar")
    public void userEntersDressesInSearchBar(){
        driver.findElement(By.id("search_query_top")).sendKeys("dresses");
    }

    @When("The user clicks the search button")
    public void userClicksSearchButton(){
        driver.findElement(By.name("submit_search")).click();
    }

    @Then("The dresses page appears")
    public void dressesPage(){
        Assert.assertEquals(driver.findElement(By.className("lighter")).getText(),"\"DRESSES\"");
    }
}
