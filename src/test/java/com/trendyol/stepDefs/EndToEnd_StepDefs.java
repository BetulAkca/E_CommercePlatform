package com.trendyol.stepDefs;

import com.trendyol.pages.CategoryPage;
import com.trendyol.utilities.BrowserUtils;
import com.trendyol.utilities.ConfigurationReader;
import com.trendyol.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class EndToEnd_StepDefs {
    CategoryPage categoryPage=new CategoryPage();

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
        categoryPage.closeIcon.click();

    }
    @When("The user navigates to the {string} category")
    public void the_user_navigates_to_the_category(String Elektronik) {
        BrowserUtils.waitFor(2);
        categoryPage.subCategory.click();
    }
    @Then("The user should see a list of products in the {string} category")
    public void the_user_should_see_a_list_of_products_in_the_category(String Elektronik) {
        assertTrue("The list of electronics is not displayed", categoryPage.listOfElectronics.isDisplayed());

    }
    // 2. Test case

    @When("The user enter the {string} in the search button")
    public void the_user_enter_the_in_the_search_button(String Laptop) {
        categoryPage.searchProduct();

    }
    @Then("The user should see a list of products related to {string}")
    public void the_user_should_see_a_list_of_products_related_to(String string) {
        assertTrue(categoryPage.resultSearch.isDisplayed());

    }
    @And("The user applies the filter brand {string}")
    public void theUserAppliesTheFilterBrand(String Apple) {
        categoryPage.appleCheckbox.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user should see a list of Apple branded laptops")
    public void the_user_should_see_a_list_of_apple_branded_laptops() {
        assertTrue(categoryPage.resultSearch.isDisplayed());
    }

    //3. case

    @When("The user selects a product {string}")
    public void the_user_selects_a_product(String string) {
        categoryPage.phone.click();
    }
    @Then("The user should see the product details page for {string}")
    public void the_user_should_see_the_product_details_page_for(String string) {


    }
    @Then("The user should see the product name, description, and price")
    public void the_user_should_see_the_product_name_description_and_price() {


    }

    //4. case
    @Given("The user is on the product details page for {string}")
    public void the_user_is_on_the_product_details_page_for(String string) {

    }
    @When("The user clicks on {string}")
    public void the_user_clicks_on(String string) {

    }
    @Then("The user should see the product added to the cart")
    public void the_user_should_see_the_product_added_to_the_cart() {

    }
    @Then("The cart should show {int} item")
    public void the_cart_should_show_item(Integer int1) {

    }


    //5.case
    @Given("The user has added a product to the cart")
    public void the_user_has_added_a_product_to_the_cart() {

    }
    @When("The user navigates to the cart")
    public void the_user_navigates_to_the_cart() {

    }
    @Then("The user should see the product in the cart")
    public void the_user_should_see_the_product_in_the_cart() {

    }
    @When("The user updates the quantity of {string} to {int}")
    public void the_user_updates_the_quantity_of_to(String string, Integer int1) {

    }
    @Then("The cart should reflect {int} items")
    public void the_cart_should_reflect_items(Integer int1) {

    }
    @When("The user removes {string} from the cart")
    public void the_user_removes_from_the_cart(String string) {

    }
    @Then("The cart should be empty")
    public void the_cart_should_be_empty() {

    }



}
