package StepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_bag {
    private WebDriver driver;

    @Given("I opened the homepage of the website")
    public void iAmOnTheSauceDemoHomepage() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I log in with username {string} and password {string}")
    public void iLogInWithUsernameAndPassword(String username, String password) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @And("I add the {string} to the cart")
    public void iAddProductToCart(String productName) {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
    }

    @And("I proceed to the shopping cart")
    public void iProceedToShoppingCart() {
        WebElement shoppingCartLink = driver.findElement(By.className("shopping_cart_link"));
        shoppingCartLink.click();
    }

    @And("I proceed to checkout")
    public void iProceedToCheckout() {
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();
    }

    @And("I enter the first name {string}")
    public void iEnterFirstName(String firstName) {
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys(firstName);
    }

    @And("I enter the last name {string}")
    public void iEnterLastName(String lastName) {
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys(lastName);
    }

    @And("I enter the postal code {string}")
    public void iEnterPostalCode(String postalCode) {
        WebElement postalCodeInput = driver.findElement(By.id("postal-code"));
        postalCodeInput.sendKeys(postalCode);
    }

    @And("I continue the checkout")
    public void iContinueCheckout() {
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
    }

    @And("I finish the checkout")
    public void iFinishCheckout() {
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
    }

    @Then("I should see the confirmation page")
    public void iShouldSeeConfirmationPage() {
        WebElement complete = driver.findElement(By.className("complete-text"));
        complete.click();
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://www.saucedemo.com/checkout-complete.html")) {
            System.out.println("Testing berhasil dan sesuai test case.");
        } else {
            System.out.println("Testing gagal atau tidak sesuai test case.");
        }

        driver.quit();
    }

}
