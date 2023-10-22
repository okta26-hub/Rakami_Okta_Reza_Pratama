package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_bag_and_remove_item {
    private WebDriver driver;

    @Given("I opened the website page")
    public void iAmOnTheSauceDemoHomepage() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I log in with user_name {string} and password {string}")
    public void iLogInWithUsernameAndPassword(String username, String password) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    @And("I add item_one the {string} to the cart")
    public void iAddItem_oneTheToTheCart(String arg0) {
        WebElement add_to_card= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        add_to_card.click();
    }

    @And("I add item_two the {string} to the cart")
    public void iAddItem_twoTheToTheCart(String arg0) {
        WebElement add_to_card2= driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        add_to_card2.click();
    }

    @And("I add item_tree  the {string} to the cart")
    public void iAddItem_treeTheToTheCart(String arg0) {
        WebElement add_to_card3= driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        add_to_card3.click();
    }

    @And("I add item_four  {string} to the cart")
    public void iAddItem_fourToTheCart(String arg0) {
        WebElement add_to_card4= driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        add_to_card4.click();
    }

    @And("I add item_five  {string} to the cart")
    public void iAddItem_fiveToTheCart(String arg0) {
        WebElement add_to_card5= driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        add_to_card5.click();
    }

    @And("I add item_six {string} to the cart")
    public void iAddItem_sixToTheCart(String arg0) {

        WebElement add_to_card6= driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        add_to_card6.click();
    }

    @And("I go to the shopping cart")
    public void iGoToTheShoppingCart() {
        WebElement shopping_cart = driver.findElement(By.className("shopping_cart_link"));
        shopping_cart.click();
    }

    @And("I remove_one the {string} from the cart")
    public void iRemove_oneTheFromTheCart(String arg0) {
        WebElement remove11= driver.findElement(By.id("remove-sauce-labs-backpack"));
        remove11.click();
    }

    @And("I remove_two the {string} from the cart")
    public void iRemove_twoTheFromTheCart(String arg0) {
        WebElement remove12= driver.findElement(By.id("remove-sauce-labs-bike-light"));
        remove12.click();
    }

    @And("I remove_tree the {string} from the cart")
    public void iRemove_treeTheFromTheCart(String arg0) {

        WebElement remove13= driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        remove13.click();
    }

    @And("I remove_four the {string} from the cart")
    public void iRemove_fourTheFromTheCart(String arg0) {
        WebElement remove14= driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        remove14.click();
    }

    @And("I remove_five the {string} from the cart")
    public void iRemove_fiveTheFromTheCart(String arg0) {
        WebElement remove15= driver.findElement(By.id("remove-sauce-labs-onesie"));
        remove15.click();
    }

    @And("I remove_six the {string} from the cart")
    public void iRemove_sixTheFromTheCart(String arg0) {
        WebElement remove6= driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
        remove6.click();
    }


    @Then("I should see an empty shopping cart")
    public void iShouldSeeAnEmptyShoppingCart() {
        String currentURL = driver.getCurrentUrl();
        WebElement complete = driver.findElement(By.className("cart_quantity_label"));
        complete.click();
        if (currentURL.equals("https://www.saucedemo.com/cart.html")) {
            System.out.println("Testing berhasil dan sesuai test case.");
        } else {
            System.out.println("Testing gagal atau tidak sesuai test case.");
        }

        driver.quit();
    }




}
